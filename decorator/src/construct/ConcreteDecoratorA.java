package construct;

/**
 * @author zmz
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void Operation(){
        super.Operation();
        addedState = "new state";
        System.out.println("具体装饰A的操作");
    }

}
