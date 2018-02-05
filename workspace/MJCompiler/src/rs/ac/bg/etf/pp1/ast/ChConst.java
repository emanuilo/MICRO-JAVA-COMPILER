// generated with ast extension for cup
// version 0.8
// 5/1/2018 9:58:39


package rs.ac.bg.etf.pp1.ast;

public class ChConst extends Factor {

    private char charr;

    public ChConst (char charr) {
        this.charr=charr;
    }

    public char getCharr() {
        return charr;
    }

    public void setCharr(char charr) {
        this.charr=charr;
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

        buffer.append(" "+tab+charr);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ChConst]");
        return buffer.toString();
    }
}
