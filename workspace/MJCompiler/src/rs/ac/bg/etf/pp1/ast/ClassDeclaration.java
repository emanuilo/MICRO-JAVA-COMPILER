// generated with ast extension for cup
// version 0.8
// 29/0/2018 16:17:58


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclaration extends ConstVarClassDecl {

    private ClassDeclars ClassDeclars;

    public ClassDeclaration (ClassDeclars ClassDeclars) {
        this.ClassDeclars=ClassDeclars;
        if(ClassDeclars!=null) ClassDeclars.setParent(this);
    }

    public ClassDeclars getClassDeclars() {
        return ClassDeclars;
    }

    public void setClassDeclars(ClassDeclars ClassDeclars) {
        this.ClassDeclars=ClassDeclars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassDeclars!=null) ClassDeclars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassDeclars!=null) ClassDeclars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassDeclars!=null) ClassDeclars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDeclaration(\n");

        if(ClassDeclars!=null)
            buffer.append(ClassDeclars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDeclaration]");
        return buffer.toString();
    }
}
