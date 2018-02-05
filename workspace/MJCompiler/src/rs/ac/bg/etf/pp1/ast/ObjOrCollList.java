// generated with ast extension for cup
// version 0.8
// 5/1/2018 13:42:7


package rs.ac.bg.etf.pp1.ast;

public class ObjOrCollList extends ObjOrCollectionList {

    private ObjOrCollectionList ObjOrCollectionList;
    private ObjOrCollection ObjOrCollection;

    public ObjOrCollList (ObjOrCollectionList ObjOrCollectionList, ObjOrCollection ObjOrCollection) {
        this.ObjOrCollectionList=ObjOrCollectionList;
        if(ObjOrCollectionList!=null) ObjOrCollectionList.setParent(this);
        this.ObjOrCollection=ObjOrCollection;
        if(ObjOrCollection!=null) ObjOrCollection.setParent(this);
    }

    public ObjOrCollectionList getObjOrCollectionList() {
        return ObjOrCollectionList;
    }

    public void setObjOrCollectionList(ObjOrCollectionList ObjOrCollectionList) {
        this.ObjOrCollectionList=ObjOrCollectionList;
    }

    public ObjOrCollection getObjOrCollection() {
        return ObjOrCollection;
    }

    public void setObjOrCollection(ObjOrCollection ObjOrCollection) {
        this.ObjOrCollection=ObjOrCollection;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ObjOrCollectionList!=null) ObjOrCollectionList.accept(visitor);
        if(ObjOrCollection!=null) ObjOrCollection.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ObjOrCollectionList!=null) ObjOrCollectionList.traverseTopDown(visitor);
        if(ObjOrCollection!=null) ObjOrCollection.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ObjOrCollectionList!=null) ObjOrCollectionList.traverseBottomUp(visitor);
        if(ObjOrCollection!=null) ObjOrCollection.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ObjOrCollList(\n");

        if(ObjOrCollectionList!=null)
            buffer.append(ObjOrCollectionList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ObjOrCollection!=null)
            buffer.append(ObjOrCollection.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ObjOrCollList]");
        return buffer.toString();
    }
}
