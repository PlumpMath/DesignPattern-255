package instance.template;

/**
 * @author zmz
 */
public abstract class TestPaper {
    public void Question1(){
        System.out.println("题目1：。。。。。。");
        System.out.println("答案："+Answer1());
    }
    protected abstract String Answer1();

    public void Question2(){
        System.out.println("题目2：。。。。。。");
        System.out.println("答案："+Answer2());
    }
    protected  abstract String Answer2();
}
