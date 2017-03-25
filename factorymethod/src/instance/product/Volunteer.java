package instance.product;

/**
 * @author zmz
 */
public class Volunteer implements LeiFeng {
    @Override
    public void Sweep() {
        System.out.println("志愿者帮忙扫地");
    }

    @Override
    public void Wash() {
        System.out.println("志愿者帮忙洗衣服");
    }

    @Override
    public void BuyRice() {
        System.out.println("志愿者帮忙买米");
    }
}
