package instance.visitors;

import instance.elements.Man;
import instance.elements.Woman;

/**
 * @author zmz
 */
public interface Action {
    void getManConclusion(Man man);
    void getWomanConclusion(Woman woman);
}
