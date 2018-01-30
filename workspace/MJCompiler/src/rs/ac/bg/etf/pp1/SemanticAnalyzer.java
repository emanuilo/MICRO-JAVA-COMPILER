package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.AddExpr;
import rs.ac.bg.etf.pp1.ast.Array;
import rs.ac.bg.etf.pp1.ast.Designator;
import rs.ac.bg.etf.pp1.ast.ErrGlobalComma;
import rs.ac.bg.etf.pp1.ast.FactorTerm;
import rs.ac.bg.etf.pp1.ast.GlobalVDeclars;
import rs.ac.bg.etf.pp1.ast.MulopTerm;
import rs.ac.bg.etf.pp1.ast.NoArray;
import rs.ac.bg.etf.pp1.ast.NumberConst;
import rs.ac.bg.etf.pp1.ast.ProgName;
import rs.ac.bg.etf.pp1.ast.Program;
import rs.ac.bg.etf.pp1.ast.SingleGlobalVarDecl;
import rs.ac.bg.etf.pp1.ast.SyntaxNode;
import rs.ac.bg.etf.pp1.ast.Term;
import rs.ac.bg.etf.pp1.ast.TermExpr;
import rs.ac.bg.etf.pp1.ast.Type;
import rs.ac.bg.etf.pp1.ast.Var;
import rs.ac.bg.etf.pp1.ast.VarDList;
import rs.ac.bg.etf.pp1.ast.VarDeclars;
import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

import org.apache.log4j.Logger;



public class SemanticAnalyzer extends VisitorAdaptor {

	boolean errorDetected = false;
	int printCallCount = 0;
	Obj currentMethod = null;
	boolean returnFound = false;
	int nVars;
	Struct currentType;

	Logger log = Logger.getLogger(getClass());

	public void report_error(String message, SyntaxNode info) {
		errorDetected = true;
		StringBuilder msg = new StringBuilder(message);
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.error(msg.toString());
	}

	public void report_info(String message, SyntaxNode info) {
		StringBuilder msg = new StringBuilder(message); 
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.info(msg.toString());
	}
	
	public void visit(Program program){
		//nVars = Tab.currentScope.getnVars();
		Tab.chainLocalSymbols(program.getProgName().obj);
		Tab.closeScope();
	}
	
	public void visit(ProgName progName){
		progName.obj = Tab.insert(Obj.Prog, progName.getPName(), Tab.noType);
		Tab.openScope();
	}
	
	//TODO visit GlobalVarDeclars  --  currentType = null;
	
	public void visit(GlobalVDeclars globalVDeclars){
		if (globalVDeclars.getBrackets() instanceof Array){
			report_info("Deklarisan globalni niz "+ globalVDeclars.getVarName(), globalVDeclars);
			Struct array = new Struct(Struct.Array, Tab.intType);
			Obj varNode = Tab.insert(Obj.Var, globalVDeclars.getVarName(), array);
		}
		else if(globalVDeclars.getBrackets() instanceof NoArray){
			report_info("Deklarisana globalna promenljiva "+ globalVDeclars.getVarName(), globalVDeclars);
			Obj varNode = Tab.insert(Obj.Var, globalVDeclars.getVarName(), currentType);
		}
	}
	
	public void visit(SingleGlobalVarDecl singleGlobalVarDecl){
		if (singleGlobalVarDecl.getBrackets() instanceof Array){
			report_info("Deklarisan globalni niz "+ singleGlobalVarDecl.getVarName(), singleGlobalVarDecl);
			Struct array = new Struct(Struct.Array, Tab.intType);
			Obj varNode = Tab.insert(Obj.Var, singleGlobalVarDecl.getVarName(), array);
		}
		else if(singleGlobalVarDecl.getBrackets() instanceof NoArray){
			report_info("Deklarisana globalna promenljiva "+ singleGlobalVarDecl.getVarName(), singleGlobalVarDecl);
			Obj varNode = Tab.insert(Obj.Var, singleGlobalVarDecl.getVarName(), currentType);
		}
	}
	
	public void visit(VarDList varDList){
		if (varDList.getBrackets() instanceof Array){
			report_info("Deklarisan niz "+ varDList.getVarName(), varDList);
			Struct array = new Struct(Struct.Array, Tab.intType);
			Obj varNode = Tab.insert(Obj.Var, varDList.getVarName(), array);
		}
		else if(varDList.getBrackets() instanceof NoArray){
			report_info("Deklarisana promenljiva "+ varDList.getVarName(), varDList);
			Obj varNode = Tab.insert(Obj.Var, varDList.getVarName(), currentType);
		}
	}
	
	public void visit(VarDeclars varDeclars){
		if (varDeclars.getBrackets() instanceof Array){
			report_info("Deklarisan niz "+ varDeclars.getVarName(), varDeclars);
			Struct array = new Struct(Struct.Array, Tab.intType);
			Obj varNode = Tab.insert(Obj.Var, varDeclars.getVarName(), array);
		}
		else if(varDeclars.getBrackets() instanceof NoArray){
			report_info("Deklarisana promenljiva "+ varDeclars.getVarName(), varDeclars);
			Obj varNode = Tab.insert(Obj.Var, varDeclars.getVarName(), currentType);
		}
	}
	
//	public void visit(ErrGlobalComma errGlobalComma){
//		report_error("Uspesan oporavak do ',' u liniji " + errGlobalComma.getLine(), null);
//	}
	
	public void visit(Type type){
		Obj typeNode = Tab.find(type.getTypeName());
		if(typeNode == Tab.noObj){
			report_error("Nije pronadjen tip " + type.getTypeName() + " u tabeli simbola!", null);
			type.struct = Tab.noType;
		}
		else{
			if(Obj.Type == typeNode.getKind()){
				currentType = type.struct = typeNode.getType();
			}
			else{
				report_error("Greska: Ime: " + type.getTypeName() + " ne predstavlja tip!", type);
				type.struct = Tab.noType;
			}
		}
	}
	
	//visit Assignment	
	
	public void visit(AddExpr addExpr){
		Struct expr = addExpr.getExpr().struct;
		Struct term = addExpr.getTerm().struct;
		if(term.equals(expr) && term == Tab.intType){
			addExpr.struct = term;
		}
		else{
			report_error("Greska na liniji "+ addExpr.getLine()+" : nekompatibilni tipovi u izrazu za sabiranje/oduzimanje.", null);
		}
	}
	
	public void visit(NumberConst numberConst){
		numberConst.struct = Tab.intType;
	}
	
	public void visit(TermExpr termExpr){
		termExpr.struct = termExpr.getTerm().struct;
	}
	
	public void visit(MulopTerm mulopTerm){
		Struct term = mulopTerm.getTerm().struct;
		Struct factor = mulopTerm.getFactor().struct;
		if(term.equals(factor) && term == Tab.intType){
			mulopTerm.struct = term;
		}
		else{
			report_error("Greska na liniji "+ mulopTerm.getLine()+" : nekompatibilni tipovi u izrazu za mnozenje/deljenje/deljenje sa ostatkom.", null);
		}
	}
	
	public void visit(FactorTerm factorTerm){
		factorTerm.struct = factorTerm.getFactor().struct;
	}
	
	public void visit(Var var){
		var.struct = var.getDesignator().obj.getType();
	}
	
	public void visit(Designator designator){
		//if ObjOrCollectionList instanceof NoObjrOrCollection
		Obj obj = Tab.find(designator.getName());
		if(obj == Tab.noObj){
			report_error("Greska na liniji " + designator.getLine() + " : ime " + designator.getName() + " nije deklarisano!", null);
		}
		else{
			report_info("Detektovana upotreba promenljive "+ designator.getName(), designator);
		}
		
		designator.obj = obj;
	}
}

















