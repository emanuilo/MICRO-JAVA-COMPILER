// generated with ast extension for cup
// version 0.8
// 29/0/2018 16:17:58


package rs.ac.bg.etf.pp1.ast;

public class NoConstVarClassDeclList extends ConstVarClassDeclList {

    public NoConstVarClassDeclList () {
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
        buffer.append("NoConstVarClassDeclList(\n");

        buffer.append(tab);
        buffer.append(") [NoConstVarClassDeclList]");
        return buffer.toString();
    }
}