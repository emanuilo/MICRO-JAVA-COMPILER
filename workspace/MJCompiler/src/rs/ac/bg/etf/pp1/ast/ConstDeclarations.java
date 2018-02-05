// generated with ast extension for cup
// version 0.8
// 5/1/2018 13:42:6


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclarations extends ConstVarClassDecl {

    private ConstDeclars ConstDeclars;

    public ConstDeclarations (ConstDeclars ConstDeclars) {
        this.ConstDeclars=ConstDeclars;
        if(ConstDeclars!=null) ConstDeclars.setParent(this);
    }

    public ConstDeclars getConstDeclars() {
        return ConstDeclars;
    }

    public void setConstDeclars(ConstDeclars ConstDeclars) {
        this.ConstDeclars=ConstDeclars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstDeclars!=null) ConstDeclars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstDeclars!=null) ConstDeclars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstDeclars!=null) ConstDeclars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclarations(\n");

        if(ConstDeclars!=null)
            buffer.append(ConstDeclars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclarations]");
        return buffer.toString();
    }
}
