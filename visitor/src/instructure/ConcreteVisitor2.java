package instructure;

/**
 * @author zmz
 */
public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visitConcretElemetnA(ConcreteElementA A) {
        System.out.println(A.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }

    @Override
    public void visitConcretElementB(ConcreteElementB B) {
        System.out.println(B.getClass().getName()+"被"+this.getClass().getName()+"访问");
    }
}
