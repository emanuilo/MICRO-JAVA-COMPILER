// generated with ast extension for cup
// version 0.8
// 5/1/2018 9:58:39


package rs.ac.bg.etf.pp1.ast;

public class CommaNumber extends CommaNumConst {

    private int number;

    public CommaNumber (int number) {
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number=number;
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
        buffer.append("CommaNumber(\n");

        buffer.append(" "+tab+number);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CommaNumber]");
        return buffer.toString();
    }
}
