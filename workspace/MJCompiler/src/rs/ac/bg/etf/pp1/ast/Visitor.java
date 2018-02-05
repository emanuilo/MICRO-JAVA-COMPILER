// generated with ast extension for cup
// version 0.8
// 5/1/2018 9:58:40


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(Mulop Mulop);
    public void visit(Relop Relop);
    public void visit(ConstVarClassDecl ConstVarClassDecl);
    public void visit(StatementList StatementList);
    public void visit(Addop Addop);
    public void visit(Factor Factor);
    public void visit(CondTerm CondTerm);
    public void visit(ExprOrNoExpr ExprOrNoExpr);
    public void visit(Term Term);
    public void visit(RelopExpr RelopExpr);
    public void visit(Condition Condition);
    public void visit(ObjOrCollection ObjOrCollection);
    public void visit(MultiVarDeclars MultiVarDeclars);
    public void visit(ConstDeclList ConstDeclList);
    public void visit(ActualParamList ActualParamList);
    public void visit(Brackets Brackets);
    public void visit(NumCharBoolConst NumCharBoolConst);
    public void visit(MethodDeclars MethodDeclars);
    public void visit(VarDeclList VarDeclList);
    public void visit(DesignatorExtension DesignatorExtension);
    public void visit(FormalParamList FormalParamList);
    public void visit(Expr Expr);
    public void visit(CommaNumConst CommaNumConst);
    public void visit(ObjOrCollectionList ObjOrCollectionList);
    public void visit(ConstVarClassDeclList ConstVarClassDeclList);
    public void visit(TypeOrVoid TypeOrVoid);
    public void visit(ActualPars ActualPars);
    public void visit(Extension Extension);
    public void visit(Statement Statement);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(FormPars FormPars);
    public void visit(GlobalVarDeclList GlobalVarDeclList);
    public void visit(LessEqual LessEqual);
    public void visit(Less Less);
    public void visit(GreaterEqual GreaterEqual);
    public void visit(Greater Greater);
    public void visit(NotEqual NotEqual);
    public void visit(Equal Equal);
    public void visit(Mod Mod);
    public void visit(Div Div);
    public void visit(Mul Mul);
    public void visit(AddopMinus AddopMinus);
    public void visit(AddopPlus AddopPlus);
    public void visit(LBracket LBracket);
    public void visit(ArrayAccess ArrayAccess);
    public void visit(ObjectAccess ObjectAccess);
    public void visit(NoObjOrCollectionList NoObjOrCollectionList);
    public void visit(ObjOrCollList ObjOrCollList);
    public void visit(Designator Designator);
    public void visit(Dec Dec);
    public void visit(Inc Inc);
    public void visit(ProcCall ProcCall);
    public void visit(ErrAssignment ErrAssignment);
    public void visit(Assignment Assignment);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(ActualParam ActualParam);
    public void visit(ActualParams ActualParams);
    public void visit(NoActuals NoActuals);
    public void visit(Actuals Actuals);
    public void visit(Parens Parens);
    public void visit(NewArray NewArray);
    public void visit(NewObject NewObject);
    public void visit(FuncCall FuncCall);
    public void visit(Var Var);
    public void visit(BooleanConst BooleanConst);
    public void visit(ChConst ChConst);
    public void visit(NumberConst NumberConst);
    public void visit(FactorTerm FactorTerm);
    public void visit(MulopTerm MulopTerm);
    public void visit(MinusTermExpr MinusTermExpr);
    public void visit(TermExpr TermExpr);
    public void visit(AddExpr AddExpr);
    public void visit(NoRelopExpr NoRelopExpr);
    public void visit(RelopExpression RelopExpression);
    public void visit(CondFact CondFact);
    public void visit(SingleCondFact SingleCondFact);
    public void visit(AndCondTerm AndCondTerm);
    public void visit(SingleCondTerm SingleCondTerm);
    public void visit(OrCondition OrCondition);
    public void visit(NoExpr NoExpr);
    public void visit(YesExpr YesExpr);
    public void visit(NoCommaNumber NoCommaNumber);
    public void visit(CommaNumber CommaNumber);
    public void visit(Body Body);
    public void visit(Print Print);
    public void visit(Read Read);
    public void visit(Return Return);
    public void visit(Continue Continue);
    public void visit(Break Break);
    public void visit(DoWhile DoWhile);
    public void visit(IfElse IfElse);
    public void visit(IfStmt IfStmt);
    public void visit(DesignatorStmt DesignatorStmt);
    public void visit(NoStmt NoStmt);
    public void visit(Statements Statements);
    public void visit(FormalParamDecl FormalParamDecl);
    public void visit(SingleFormalParamDecl SingleFormalParamDecl);
    public void visit(FormalParamDecls FormalParamDecls);
    public void visit(NoFormParam NoFormParam);
    public void visit(FormParams FormParams);
    public void visit(VoidType VoidType);
    public void visit(MethodType MethodType);
    public void visit(MethodTypeName MethodTypeName);
    public void visit(MethodDecl MethodDecl);
    public void visit(NoMethodDecl NoMethodDecl);
    public void visit(MethodDeclarList MethodDeclarList);
    public void visit(Type Type);
    public void visit(NoMultiVarDeclars NoMultiVarDeclars);
    public void visit(MultiVarDeclarations MultiVarDeclarations);
    public void visit(NoMethodDeclars NoMethodDeclars);
    public void visit(MethodDeclarations MethodDeclarations);
    public void visit(NoExtends NoExtends);
    public void visit(Extends Extends);
    public void visit(ClassDeclars ClassDeclars);
    public void visit(NoVarDeclList NoVarDeclList);
    public void visit(VarDList VarDList);
    public void visit(NoArray NoArray);
    public void visit(Array Array);
    public void visit(VarDeclars VarDeclars);
    public void visit(ErrGlobalSemi ErrGlobalSemi);
    public void visit(SingleGlobalVarDecl SingleGlobalVarDecl);
    public void visit(ErrGlobalComma ErrGlobalComma);
    public void visit(GlobalVDeclars GlobalVDeclars);
    public void visit(GlobalVarDeclars GlobalVarDeclars);
    public void visit(BoolConst BoolConst);
    public void visit(CharConst CharConst);
    public void visit(NumConst NumConst);
    public void visit(ConstName ConstName);
    public void visit(ConstDecl ConstDecl);
    public void visit(SingleConstDecl SingleConstDecl);
    public void visit(ConstDecls ConstDecls);
    public void visit(ConstDeclars ConstDeclars);
    public void visit(ClassDeclaration ClassDeclaration);
    public void visit(GlobalVarDeclarations GlobalVarDeclarations);
    public void visit(ConstDeclarations ConstDeclarations);
    public void visit(NoConstVarClassDeclList NoConstVarClassDeclList);
    public void visit(ConstVarClassDeclares ConstVarClassDeclares);
    public void visit(ProgName ProgName);
    public void visit(Program Program);

}
