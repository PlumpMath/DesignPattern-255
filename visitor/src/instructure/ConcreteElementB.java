package instructure;

/**
 * @author zmz
 */
public class ConcreteElementB implements  Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcretElementB(this);
    }

    //其他相关操作
    public void operationB(){}
}
