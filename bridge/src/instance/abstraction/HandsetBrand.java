package instance.abstraction;

import instance.implementor.HandsetSoftware;

/**
 * @author zmz
 */
public abstract class HandsetBrand {
    protected HandsetSoftware soft;

    public void setSoft(HandsetSoftware soft) {
        this.soft = soft;
    }

    public abstract void run();
}
