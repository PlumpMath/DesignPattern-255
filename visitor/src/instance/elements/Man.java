package instance.elements;

import instance.visitors.Action;

/**
 * @author zmz
 */
public class Man implements Person {
    @Override
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
