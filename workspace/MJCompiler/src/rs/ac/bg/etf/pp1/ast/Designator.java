// generated with ast extension for cup
// version 0.8
// 31/0/2018 14:28:13


package rs.ac.bg.etf.pp1.ast;

public class Designator implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Obj obj = null;

    private String name;
    private ObjOrCollectionList ObjOrCollectionList;

    public Designator (String name, ObjOrCollectionList ObjOrCollectionList) {
        this.name=name;
        this.ObjOrCollectionList=ObjOrCollectionList;
        if(ObjOrCollectionList!=null) ObjOrCollectionList.setParent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public ObjOrCollectionList getObjOrCollectionList() {
        return ObjOrCollectionList;
    }

    public void setObjOrCollectionList(ObjOrCollectionList ObjOrCollectionList) {
        this.ObjOrCollectionList=ObjOrCollectionList;
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
        if(ObjOrCollectionList!=null) ObjOrCollectionList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ObjOrCollectionList!=null) ObjOrCollectionList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ObjOrCollectionList!=null) ObjOrCollectionList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Designator(\n");

        buffer.append(" "+tab+name);
        buffer.append("\n");

        if(ObjOrCollectionList!=null)
            buffer.append(ObjOrCollectionList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Designator]");
        return buffer.toString();
    }
}
