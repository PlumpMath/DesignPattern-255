package instance.country;

import instance.mediator.UnitedNations;

/**
 * @author zmz
 */
public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String msg){
        mediator.declare(msg, this);
    }

    public void GetMsg(String msg){
        System.out.println("USA得到消息："+msg);
    }
}
