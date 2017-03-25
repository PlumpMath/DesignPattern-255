package structure;

/**
 * @author zmz
 */
public class Proxy implements Subject{
    private RealSubject realSubject;

    @Override
    public void Request() {
        if(null==realSubject){
            realSubject = new RealSubject();
        }
        System.out.println("do something before");
        realSubject.Request();
        System.out.println("do something after");
    }
}
