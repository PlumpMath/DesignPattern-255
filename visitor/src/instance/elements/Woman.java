package instance.elements;

import instance.visitors.Action;

/**
 * @author zmz
 */
public class Woman implements Person {
    @Override
    public void accept(Action action) {
        action.getWomanConclusion(this);
    }
}
