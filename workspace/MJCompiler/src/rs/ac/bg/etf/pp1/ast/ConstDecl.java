// generated with ast extension for cup
// version 0.8
// 29/0/2018 16:17:58


package rs.ac.bg.etf.pp1.ast;

public class ConstDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String I1;
    private NumCharBoolConst NumCharBoolConst;

    public ConstDecl (String I1, NumCharBoolConst NumCharBoolConst) {
        this.I1=I1;
        this.NumCharBoolConst=NumCharBoolConst;
        if(NumCharBoolConst!=null) NumCharBoolConst.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
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
        if(NumCharBoolConst!=null) NumCharBoolConst.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NumCharBoolConst!=null) NumCharBoolConst.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NumCharBoolConst!=null) NumCharBoolConst.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDecl(\n");

        buffer.append(" "+tab+I1);
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