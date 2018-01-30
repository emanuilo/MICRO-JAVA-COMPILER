// generated with ast extension for cup
// version 0.8
// 30/0/2018 12:51:18


package rs.ac.bg.etf.pp1.ast;

public class ConstVarClassDeclares extends ConstVarClassDeclList {

    private ConstVarClassDeclList ConstVarClassDeclList;
    private ConstVarClassDecl ConstVarClassDecl;

    public ConstVarClassDeclares (ConstVarClassDeclList ConstVarClassDeclList, ConstVarClassDecl ConstVarClassDecl) {
        this.ConstVarClassDeclList=ConstVarClassDeclList;
        if(ConstVarClassDeclList!=null) ConstVarClassDeclList.setParent(this);
        this.ConstVarClassDecl=ConstVarClassDecl;
        if(ConstVarClassDecl!=null) ConstVarClassDecl.setParent(this);
    }

    public ConstVarClassDeclList getConstVarClassDeclList() {
        return ConstVarClassDeclList;
    }

    public void setConstVarClassDeclList(ConstVarClassDeclList ConstVarClassDeclList) {
        this.ConstVarClassDeclList=ConstVarClassDeclList;
    }

    public ConstVarClassDecl getConstVarClassDecl() {
        return ConstVarClassDecl;
    }

    public void setConstVarClassDecl(ConstVarClassDecl ConstVarClassDecl) {
        this.ConstVarClassDecl=ConstVarClassDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstVarClassDeclList!=null) ConstVarClassDeclList.accept(visitor);
        if(ConstVarClassDecl!=null) ConstVarClassDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstVarClassDeclList!=null) ConstVarClassDeclList.traverseTopDown(visitor);
        if(ConstVarClassDecl!=null) ConstVarClassDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstVarClassDeclList!=null) ConstVarClassDeclList.traverseBottomUp(visitor);
        if(ConstVarClassDecl!=null) ConstVarClassDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstVarClassDeclares(\n");

        if(ConstVarClassDeclList!=null)
            buffer.append(ConstVarClassDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstVarClassDecl!=null)
            buffer.append(ConstVarClassDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstVarClassDeclares]");
        return buffer.toString();
    }
}
