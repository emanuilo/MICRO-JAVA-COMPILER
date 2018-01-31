// generated with ast extension for cup
// version 0.8
// 31/0/2018 14:28:13


package rs.ac.bg.etf.pp1.ast;

public class ChConst extends Factor {

    private char C1;

    public ChConst (char C1) {
        this.C1=C1;
    }

    public char getC1() {
        return C1;
    }

    public void setC1(char C1) {
        this.C1=C1;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ChConst(\n");

        buffer.append(" "+tab+C1);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ChConst]");
        return buffer.toString();
    }
}
