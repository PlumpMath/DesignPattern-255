package instance.state.impl;

import instance.context.Work;
import instance.state.WorkState;

/**
 * @author zmz
 */
public class SleepingWorkState implements WorkState {
    @Override
    public void Programming(Work work) {
        System.out.println("当前时间"+work.getHour()+"，睡着也能写代码");
    }
}
