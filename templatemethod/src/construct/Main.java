package construct;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        AbstractClass c;
        c = new ConcreteClassA();
        c.TemplateMethod();

        c = new ConcreteClassB();
        c.TemplateMethod();
    }
}
