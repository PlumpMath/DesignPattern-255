package instance.Handler;

import instance.test.Request;

/**
 * @author zmz
 */
public abstract class Manager {
    protected String name;
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior){
        this.superior = superior;
    }

    public abstract void requestApplication(Request request);
}
