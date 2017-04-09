package instructure;

/**
 * @author zmz
 */
public interface Element {
    void accept(Visitor visitor);
}
