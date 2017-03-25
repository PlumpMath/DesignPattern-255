package instance.product;

/**
 * @author zmz
 */
public class Undergraduate implements LeiFeng {
    @Override
    public void Sweep() {
        System.out.println("学生帮忙扫地");
    }

    @Override
    public void Wash() {
        System.out.println("学生帮忙洗衣服");
    }

    @Override
    public void BuyRice() {
        System.out.println("学生帮忙买米");
    }
}
