package instance.context;

import instance.state.WorkState;

/**
 * @author zmz
 */
public class Work {
    private WorkState current;

    public Work(WorkState current) {
        this.current = current;
    }

    private double hour;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    private boolean finish = false;

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setCurrent(WorkState current) {
        this.current = current;
    }

    public void Programming(){
        current.Programming(this);
    }
}
