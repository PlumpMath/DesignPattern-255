package instructure;

/**
 * @author zmz
 */
public interface Iterator<T> {
    T first();
    T next();
    boolean isDone();
    T currentItem();
}
