package instrcuture;

/**
 * @author zmz
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void Request(){
        state.Handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态"+state.getClass().getName().toString());
    }
}
