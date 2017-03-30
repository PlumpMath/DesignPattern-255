package instance.state.impl;

import instance.context.Work;
import instance.state.WorkState;

/**
 * @author zmz
 */
public class EveningWorkState implements WorkState {
    @Override
    public void Programming(Work work) {
        if(work.isFinish()){
            work.setCurrent(new RestWorkState());
            work.Programming();
        }else{
            if(work.getHour()<21){
                System.out.println("当前时间"+work.getHour()+"，贼几把困");
            }else{
                work.setCurrent(new SleepingWorkState());
                work.Programming();
            }
        }
    }
}
