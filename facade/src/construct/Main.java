package construct;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
        facade.methodGroup();
    }
}
