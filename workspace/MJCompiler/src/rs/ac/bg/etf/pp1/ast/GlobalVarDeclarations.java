// generated with ast extension for cup
// version 0.8
// 5/1/2018 9:58:39


package rs.ac.bg.etf.pp1.ast;

public class GlobalVarDeclarations extends ConstVarClassDecl {

    private GlobalVarDeclars GlobalVarDeclars;

    public GlobalVarDeclarations (GlobalVarDeclars GlobalVarDeclars) {
        this.GlobalVarDeclars=GlobalVarDeclars;
        if(GlobalVarDeclars!=null) GlobalVarDeclars.setParent(this);
    }

    public GlobalVarDeclars getGlobalVarDeclars() {
        return GlobalVarDeclars;
    }

    public void setGlobalVarDeclars(GlobalVarDeclars GlobalVarDeclars) {
        this.GlobalVarDeclars=GlobalVarDeclars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(GlobalVarDeclars!=null) GlobalVarDeclars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(GlobalVarDeclars!=null) GlobalVarDeclars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(GlobalVarDeclars!=null) GlobalVarDeclars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("GlobalVarDeclarations(\n");

        if(GlobalVarDeclars!=null)
            buffer.append(GlobalVarDeclars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GlobalVarDeclarations]");
        return buffer.toString();
    }
}
