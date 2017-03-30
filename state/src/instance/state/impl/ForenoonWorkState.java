package instance.state.impl;

import instance.context.Work;
import instance.state.WorkState;

/**
 * @author zmz
 */
public class ForenoonWorkState implements WorkState {
    @Override
    public void Programming(Work work) {
        if(work.getHour()<12){
            System.out.println("当前时间："+work.getHour()+"，上午工作，精神百倍");
        }else{
            work.setCurrent(new NoonWorkState());
            work.Programming();
        }
    }
}
