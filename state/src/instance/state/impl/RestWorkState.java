package instance.state.impl;

import instance.context.Work;
import instance.state.WorkState;

/**
 * @author zmz
 */
public class RestWorkState implements WorkState {
    @Override
    public void Programming(Work work) {
        System.out.println("当前时间"+work.getHour()+"，下班回家");
    }
}
