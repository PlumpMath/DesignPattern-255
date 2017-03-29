package instance.subject;

/**
 * @author zmz
 */
public interface Subject {
    void NotifyAll();
    void addListener(Object obj, String method, Object... args);
}
