package instructure;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Abstraction ab = new RedefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
