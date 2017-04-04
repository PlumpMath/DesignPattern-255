package instructure;

/**
 * @author zmz
 */
public class ConcreteColleague2  extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void seend(String msg){
        mediator.send(msg, this);
    }

    public void Notify(String msg){
        System.out.println("同事2得到消息"+msg);
    }
}
