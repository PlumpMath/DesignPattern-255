package instrcuture;

/**
 * @author zmz
 */
public class ConcreteStateA implements State{
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
