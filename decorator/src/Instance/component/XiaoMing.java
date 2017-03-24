package Instance.component;

/**
 * @author zmz
 */
public class XiaoMing implements Person {
    @Override
    public void Show() {
        System.out.println("装扮的"+name);
    }

    private String name;
    public XiaoMing(String name){
        this.name = name;
    }
}
