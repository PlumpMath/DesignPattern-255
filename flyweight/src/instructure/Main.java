package instructure;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        int e = 22;
        FlyweightFactory f = new FlyweightFactory();
        Flyweight fx  = f.getFlyWeight("X");
        fx.operation(--e);
        Flyweight fy = f.getFlyWeight("Y");
        fy.operation(--e);
        Flyweight fz = f.getFlyWeight("Z");
        fz.operation(--e);

        Flyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--e);
    }
}
