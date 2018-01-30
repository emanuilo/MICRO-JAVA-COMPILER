// generated with ast extension for cup
// version 0.8
// 30/0/2018 12:51:19


package rs.ac.bg.etf.pp1.ast;

public class ChConst extends Factor {

    private String S1;

    public ChConst (String S1) {
        this.S1=S1;
    }

    public String getS1() {
        return S1;
    }

    public void setS1(String S1) {
        this.S1=S1;
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

        buffer.append(" "+tab+S1);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ChConst]");
        return buffer.toString();
    }
}
