package instructure.objectAdaptor;

/**
 * @author zmz
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}
