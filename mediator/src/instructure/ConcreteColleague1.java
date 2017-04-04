package instructure;

/**
 * @author zmz
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
    
    public void send(String msg){
        mediator.send(msg, this);
    }
    
    public void Notify(String msg){
        System.out.println("同事1得到消息"+msg);
    }
}
