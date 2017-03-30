package instructure.classAdaptor;

/**
 * @author zmz
 */
public class Adaptor extends Adaptee implements Target {
    @Override
    public void Request() {
        super.SpecificRequest();
    }
}
