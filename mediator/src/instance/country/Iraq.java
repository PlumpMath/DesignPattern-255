package instance.country;

import instance.mediator.UnitedNations;

/**
 * @author zmz
 */
public class Iraq extends Country {
    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String msg){
        mediator.declare(msg, this);
    }

    public void GetMsg(String msg){
        System.out.println("Iraq得到消息："+msg);
    }
}
