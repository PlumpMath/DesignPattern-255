package instance.state.impl;

import instance.context.Work;
import instance.state.WorkState;

/**
 * @author zmz
 */
public class NoonWorkState implements WorkState {
    @Override
    public void Programming(Work work) {
        if(work.getHour()<13){
            System.out.println("当前时间"+work.getHour()+"，饿了，犯困");
        }else{
            work.setCurrent(new AfterNoonWorkState());
            work.Programming();
        }
    }
}
