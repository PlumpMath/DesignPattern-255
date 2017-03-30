package instrcuture;

/**
 * @author zmz
 */
public class ConcreteStateB implements State {
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
