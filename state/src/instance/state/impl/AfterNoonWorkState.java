package instance.state.impl;

import instance.context.Work;
import instance.state.WorkState;

/**
 * @author zmz
 */
public class AfterNoonWorkState implements WorkState {
    @Override
    public void Programming(Work work) {
        if(work.getHour()<17){
            System.out.println("当前时间"+work.getHour()+"，下午状态回来了，继续工作");
        }else{
            work.setCurrent(new EveningWorkState());
            work.Programming();
        }
    }
}
