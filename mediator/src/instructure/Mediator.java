package instructure;

/**
 * @author zmz
 */
public interface Mediator {
    void send(String msg, Colleague colleague);
}
