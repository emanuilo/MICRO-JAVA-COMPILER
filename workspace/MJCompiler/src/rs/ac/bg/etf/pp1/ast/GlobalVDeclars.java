// generated with ast extension for cup
// version 0.8
// 5/1/2018 13:42:6


package rs.ac.bg.etf.pp1.ast;

public class GlobalVDeclars extends GlobalVarDeclList {

    private String varName;
    private Brackets Brackets;
    private GlobalVarDeclList GlobalVarDeclList;

    public GlobalVDeclars (String varName, Brackets Brackets, GlobalVarDeclList GlobalVarDeclList) {
        this.varName=varName;
        this.Brackets=Brackets;
        if(Brackets!=null) Brackets.setParent(this);
        this.GlobalVarDeclList=GlobalVarDeclList;
        if(GlobalVarDeclList!=null) GlobalVarDeclList.setParent(this);
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName=varName;
    }

    public Brackets getBrackets() {
        return Brackets;
    }

    public void setBrackets(Brackets Brackets) {
        this.Brackets=Brackets;
    }

    public GlobalVarDeclList getGlobalVarDeclList() {
        return GlobalVarDeclList;
    }

    public void setGlobalVarDeclList(GlobalVarDeclList GlobalVarDeclList) {
        this.GlobalVarDeclList=GlobalVarDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Brackets!=null) Brackets.accept(visitor);
        if(GlobalVarDeclList!=null) GlobalVarDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Brackets!=null) Brackets.traverseTopDown(visitor);
        if(GlobalVarDeclList!=null) GlobalVarDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Brackets!=null) Brackets.traverseBottomUp(visitor);
        if(GlobalVarDeclList!=null) GlobalVarDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("GlobalVDeclars(\n");

        buffer.append(" "+tab+varName);
        buffer.append("\n");

        if(Brackets!=null)
            buffer.append(Brackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(GlobalVarDeclList!=null)
            buffer.append(GlobalVarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GlobalVDeclars]");
        return buffer.toString();
    }
}
