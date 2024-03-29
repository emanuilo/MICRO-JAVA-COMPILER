// generated with ast extension for cup
// version 0.8
// 5/1/2018 13:42:6


package rs.ac.bg.etf.pp1.ast;

public class ConstDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private ConstName ConstName;
    private NumCharBoolConst NumCharBoolConst;

    public ConstDecl (ConstName ConstName, NumCharBoolConst NumCharBoolConst) {
        this.ConstName=ConstName;
        if(ConstName!=null) ConstName.setParent(this);
        this.NumCharBoolConst=NumCharBoolConst;
        if(NumCharBoolConst!=null) NumCharBoolConst.setParent(this);
    }

    public ConstName getConstName() {
        return ConstName;
    }

    public void setConstName(ConstName ConstName) {
        this.ConstName=ConstName;
    }

    public NumCharBoolConst getNumCharBoolConst() {
        return NumCharBoolConst;
    }

    public void setNumCharBoolConst(NumCharBoolConst NumCharBoolConst) {
        this.NumCharBoolConst=NumCharBoolConst;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstName!=null) ConstName.accept(visitor);
        if(NumCharBoolConst!=null) NumCharBoolConst.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstName!=null) ConstName.traverseTopDown(visitor);
        if(NumCharBoolConst!=null) NumCharBoolConst.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstName!=null) ConstName.traverseBottomUp(visitor);
        if(NumCharBoolConst!=null) NumCharBoolConst.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDecl(\n");

        if(ConstName!=null)
            buffer.append(ConstName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(NumCharBoolConst!=null)
            buffer.append(NumCharBoolConst.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDecl]");
        return buffer.toString();
    }
}
