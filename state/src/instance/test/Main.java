package instance.test;

import instance.context.Work;
import instance.state.impl.ForenoonWorkState;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Work work = new Work(new ForenoonWorkState());

        work.setHour(9);
        work.Programming();
        work.setHour(10);
        work.Programming();
        work.setHour(12);
        work.Programming();
        work.setHour(13);
        work.Programming();
        work.setHour(14);
        work.Programming();
        work.setHour(17);

        work.setFinish(false);
        work.Programming();
        work.setHour(19);
        work.Programming();
        work.setHour(22);
        work.Programming();
    }
}
