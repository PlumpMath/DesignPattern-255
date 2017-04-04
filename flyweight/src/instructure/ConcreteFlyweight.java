package instructure;

/**
 * @author zmz
 */
public class ConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight："+extrinsicstate);
    }
}
