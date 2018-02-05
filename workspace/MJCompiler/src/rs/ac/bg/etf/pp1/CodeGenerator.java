package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.CounterVisitor.FormParamCounter;
import rs.ac.bg.etf.pp1.CounterVisitor.VarCounter;
import rs.ac.bg.etf.pp1.ast.AddExpr;
import rs.ac.bg.etf.pp1.ast.AddopMinus;
import rs.ac.bg.etf.pp1.ast.AddopPlus;
import rs.ac.bg.etf.pp1.ast.ArrayAccess;
import rs.ac.bg.etf.pp1.ast.Assignment;
import rs.ac.bg.etf.pp1.ast.ChConst;
import rs.ac.bg.etf.pp1.ast.CommaNumber;
import rs.ac.bg.etf.pp1.ast.Dec;
import rs.ac.bg.etf.pp1.ast.Designator;
import rs.ac.bg.etf.pp1.ast.DesignatorStatement;
import rs.ac.bg.etf.pp1.ast.Div;
import rs.ac.bg.etf.pp1.ast.Factor;
import rs.ac.bg.etf.pp1.ast.FuncCall;
import rs.ac.bg.etf.pp1.ast.Inc;
import rs.ac.bg.etf.pp1.ast.LBracket;
import rs.ac.bg.etf.pp1.ast.MethodDecl;
import rs.ac.bg.etf.pp1.ast.MethodTypeName;
import rs.ac.bg.etf.pp1.ast.MinusTermExpr;
import rs.ac.bg.etf.pp1.ast.Mod;
import rs.ac.bg.etf.pp1.ast.Mul;
import rs.ac.bg.etf.pp1.ast.MulopTerm;
import rs.ac.bg.etf.pp1.ast.NewArray;
import rs.ac.bg.etf.pp1.ast.NumberConst;
import rs.ac.bg.etf.pp1.ast.Print;
import rs.ac.bg.etf.pp1.ast.Read;
import rs.ac.bg.etf.pp1.ast.Return;
import rs.ac.bg.etf.pp1.ast.SyntaxNode;
import rs.ac.bg.etf.pp1.ast.Var;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class CodeGenerator extends VisitorAdaptor {
	private int mainPc;
	
	public int getMainPc() {
		return mainPc;
	}

	public void visit(MethodTypeName methodTypeName){
		if("main".equalsIgnoreCase(methodTypeName.getMethName()))
			mainPc = Code.pc;
		
		methodTypeName.obj.setAdr(Code.pc);
		
		SyntaxNode methodNode = methodTypeName.getParent();
		
		//brojanje lokalnih varijabli
		VarCounter varCounter = new VarCounter();
		methodNode.traverseTopDown(varCounter);
		
		//brojanje formalnih parametara
		FormParamCounter formParamCounter = new FormParamCounter();
		methodNode.traverseTopDown(formParamCounter);
		
		Code.put(Code.enter);
		Code.put(formParamCounter.getCount());
		Code.put(varCounter.getCount() + formParamCounter.getCount());
	}
	
	public void visit(MethodDecl methodDecl){
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	//TODO sta se desi ako se izvrsi i visit(Return) i visit(MethodDecl)
	public void visit(Return Return){
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	public void visit(Assignment assignment){
		DesignatorStatement designatorStatement = (DesignatorStatement) assignment.getParent();
		Code.store(designatorStatement.getDesignator().obj);
	}
	
	public void visit(NumberConst numberConst){
		if(numberConst.getParent().getParent().getClass() == MinusTermExpr.class)
			Code.load(new Obj(Obj.Con, "$", numberConst.struct, -numberConst.getNumber(), 0));
		else
			Code.load(new Obj(Obj.Con, "$", numberConst.struct, numberConst.getNumber(), 0));
	}
	
	public void visit(ChConst chConst){
		Code.load(new Obj(Obj.Con, "$", chConst.struct, chConst.getCharr(), 0));
	}
	
	public void visit(Var var){
		if(var.getParent().getParent().getClass() == MinusTermExpr.class){
			Code.load(var.getDesignator().obj);
			Code.put(Code.neg);
		}
		else{
			Code.load(var.getDesignator().obj);
		}
	}
	
	public void visit(AddExpr addExpr){
		if(addExpr.getAddop() instanceof AddopPlus){
			Code.put(Code.add);
		}
		else if(addExpr.getAddop() instanceof AddopMinus){
			Code.put(Code.sub);
		}
	}
	
	public void visit(Print print){
		Struct exprType = print.getExpr().struct;
		if(print.getCommaNumConst() instanceof CommaNumber){ //print(x, NUMCONST)
			CommaNumber commaNumber = (CommaNumber) print.getCommaNumConst();
			int number = commaNumber.getNumber();
			
			Code.loadConst(number);
			if(exprType == Tab.intType)
				Code.put(Code.print);
			else
				Code.put(Code.bprint);
		}
		else{ //print(x)
			Code.put(Code.const_1);
			if(exprType == Tab.intType)
				Code.put(Code.print);
			else
				Code.put(Code.bprint);
		}
	}
	
	public void visit(Read read){
		Designator designator = read.getDesignator();
		Code.put(Code.read);
		Code.store(designator.obj);
	}
	
	public void visit(Inc inc){
		DesignatorStatement designatorStatement = (DesignatorStatement) inc.getParent();
		Code.load(designatorStatement.getDesignator().obj);
		Code.load(new Obj(Obj.Con, "$", Tab.intType, 1, 0));
		Code.put(Code.add);
		
		Code.store(designatorStatement.getDesignator().obj);
	}
	
	public void visit(Dec dec){
		DesignatorStatement designatorStatement = (DesignatorStatement) dec.getParent();
		Code.load(designatorStatement.getDesignator().obj);
		Code.load(new Obj(Obj.Con, "$", Tab.intType, 1, 0));
		Code.put(Code.sub);
		
		Code.store(designatorStatement.getDesignator().obj);
	}
	
	public void visit(MulopTerm mulopTerm){
		if(mulopTerm.getMulop() instanceof Mul){
			Code.put(Code.mul);
		}
		else if(mulopTerm.getMulop() instanceof Div){
			Code.put(Code.div);
		}
		else if(mulopTerm.getMulop() instanceof Mod){
			Code.put(Code.rem);
		}
	}
	
	public void visit(FuncCall funcCall){
		Obj funcObj = funcCall.getDesignator().obj;
		int offset = funcObj.getAdr() - Code.pc;
		Code.put(Code.call);
		Code.put2(offset);
	}
	
	public void visit(NewArray newArray){
		Code.put(Code.newarray);
		if(newArray.getType().struct == Tab.intType){
			Code.put(1); 
		}
		else
			Code.put(0);
	}
	
	public void visit(ArrayAccess arrayAccess){
//		Designator designator = (Designator) arrayAccess.getParent().getParent();
//		if(designator.getParent().getClass() == Factor.class)
//			Code.load(designator.obj);
	}
	
	public void visit(LBracket lBracket){
		Code.load(lBracket.obj);
	}
}






