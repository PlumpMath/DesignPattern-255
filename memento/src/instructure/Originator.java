package instructure;

/**
 * @author zmz
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento CreateMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento mem){
        state = mem.getState();
    }

    public void Show(){
        System.out.println("state:"+state);
    }
}
