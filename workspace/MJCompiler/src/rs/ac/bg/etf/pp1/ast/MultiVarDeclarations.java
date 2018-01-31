// generated with ast extension for cup
// version 0.8
// 31/0/2018 14:28:12


package rs.ac.bg.etf.pp1.ast;

public class MultiVarDeclarations extends MultiVarDeclars {

    private MultiVarDeclars MultiVarDeclars;
    private VarDeclars VarDeclars;

    public MultiVarDeclarations (MultiVarDeclars MultiVarDeclars, VarDeclars VarDeclars) {
        this.MultiVarDeclars=MultiVarDeclars;
        if(MultiVarDeclars!=null) MultiVarDeclars.setParent(this);
        this.VarDeclars=VarDeclars;
        if(VarDeclars!=null) VarDeclars.setParent(this);
    }

    public MultiVarDeclars getMultiVarDeclars() {
        return MultiVarDeclars;
    }

    public void setMultiVarDeclars(MultiVarDeclars MultiVarDeclars) {
        this.MultiVarDeclars=MultiVarDeclars;
    }

    public VarDeclars getVarDeclars() {
        return VarDeclars;
    }

    public void setVarDeclars(VarDeclars VarDeclars) {
        this.VarDeclars=VarDeclars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MultiVarDeclars!=null) MultiVarDeclars.accept(visitor);
        if(VarDeclars!=null) VarDeclars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MultiVarDeclars!=null) MultiVarDeclars.traverseTopDown(visitor);
        if(VarDeclars!=null) VarDeclars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MultiVarDeclars!=null) MultiVarDeclars.traverseBottomUp(visitor);
        if(VarDeclars!=null) VarDeclars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultiVarDeclarations(\n");

        if(MultiVarDeclars!=null)
            buffer.append(MultiVarDeclars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclars!=null)
            buffer.append(VarDeclars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultiVarDeclarations]");
        return buffer.toString();
    }
}
