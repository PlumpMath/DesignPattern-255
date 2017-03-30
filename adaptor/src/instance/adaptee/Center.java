package instance.adaptee;

/**
 * @author zmz
 */
public class Center {
    private String name;

    public Center(String name) {
        this.name = name;
    }

    public void Attack(){
        System.out.println(name+"进攻");
    }

    public void Defense(){
        System.out.println(name+"防守");
    }
}
