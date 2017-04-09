package instance.elements;

import instance.visitors.Action;

/**
 * @author zmz
 */
public interface Person {
    void accept(Action action);
}
