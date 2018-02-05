// generated with ast extension for cup
// version 0.8
// 5/1/2018 13:42:7


package rs.ac.bg.etf.pp1.ast;

public class BooleanConst extends Factor {

    private String bool;

    public BooleanConst (String bool) {
        this.bool=bool;
    }

    public String getBool() {
        return bool;
    }

    public void setBool(String bool) {
        this.bool=bool;
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
        buffer.append("BooleanConst(\n");

        buffer.append(" "+tab+bool);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [BooleanConst]");
        return buffer.toString();
    }
}
