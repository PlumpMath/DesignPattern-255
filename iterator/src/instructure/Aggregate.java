package instructure;

import java.util.*;

/**
 * @author zmz
 */
public interface Aggregate<T> {
    Iterator<T> iterator();
}
