package instance.subject;

import construct.*;
import instance.event.EventHandler;

/**
 * @author zmz
 */
public class Boss implements Subject {

    private String name;
    private EventHandler handler;

    public Boss(String name, EventHandler handler) {
        this.name = name;
        this.handler = handler;
    }

    @Override
    public void NotifyAll() {
        handler.NotifyAll();
    }

    @Override
    public void addListener(Object obj, String method, Object... args) {
        handler.addEvent(obj, method, args);
    }
}
