package construct;

/**
 * @author zmz
 */
public class Facade {
    private SubSystem1 sub1;
    private SubSystem2 sub2;
    private SubSystem3 sub3;

    public Facade() {
        sub1 = new SubSystem1();
        sub2 = new SubSystem2();
        sub3 = new SubSystem3();
    }

    public void methodA(){
        sub1.method();
    }
    public void methodB(){
        sub2.method();
    }
    public void methodC(){
        sub3.method();
    }

    public void methodGroup(){
        sub1.method();
        sub2.method();
        sub3.method();
    }
}
