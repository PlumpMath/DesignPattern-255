package instance.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zmz
 */
public class EventHandler {
    private List<Event> list;

    public EventHandler() {
        list = new ArrayList<>();
    }

    public void addEvent(Object obj, String method, Object... args){
        list.add(new Event(obj, method, args));
    }

    public void NotifyAll(){
        for(Event e : list){
            e.invoke();
        }
    }
}
