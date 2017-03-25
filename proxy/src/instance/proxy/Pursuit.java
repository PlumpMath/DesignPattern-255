package instance.proxy;

/**
 * @author zmz
 */
public class Pursuit implements IGiveGift {
    private String name;

    public Pursuit(String name) {
        this.name = name;
    }

    @Override
    public void GiveDlls() {
        System.out.println(name+"送你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(name+"送你鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(name+"送你巧克力");
    }
}
