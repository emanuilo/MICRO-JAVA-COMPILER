// generated with ast extension for cup
// version 0.8
// 31/0/2018 14:28:13


package rs.ac.bg.etf.pp1.ast;

public class NumberConst extends Factor {

    private int N1;

    public NumberConst (int N1) {
        this.N1=N1;
    }

    public int getN1() {
        return N1;
    }

    public void setN1(int N1) {
        this.N1=N1;
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
        buffer.append("NumberConst(\n");

        buffer.append(" "+tab+N1);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NumberConst]");
        return buffer.toString();
    }
}
