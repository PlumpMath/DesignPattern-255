package construct;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        /*
         * 装饰的方法是：
         * 首先调用ConcreteComponent实例化对象c
         * 然后用ConcreteDecoratorA的实例化对象d1包装c
         * 然后用ConcreteDecoratorB的实例化对象d2包装d1
         * 最终执行d2的Operation
         */
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.Operation();
    }
}
