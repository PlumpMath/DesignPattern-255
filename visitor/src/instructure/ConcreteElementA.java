package instructure;

/**
 * @author zmz
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcretElemetnA(this);
    }

    //其他相关方法
    public void operationA(){}
}
