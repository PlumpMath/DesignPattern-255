package instructure;

/**
 * @author zmz
 */
public class RedefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        System.out.println("重定义");
        implementor.operation();
    }
}
