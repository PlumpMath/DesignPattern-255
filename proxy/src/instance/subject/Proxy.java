package instance.subject;

import instance.proxy.IGiveGift;
import instance.proxy.Pursuit;

/**
 * @author zmz
 */
public class Proxy implements IGiveGift {
    private Pursuit pursuit;

    public Proxy(Pursuit pursuit) {
        this.pursuit = pursuit;
    }

    @Override
    public void GiveDlls() {
        System.out.println("do something before");
        pursuit.GiveDlls();
        System.out.println("do somethign after");
    }

    @Override
    public void GiveFlowers() {
        System.out.println("do something before");
        pursuit.GiveFlowers();
        System.out.println("do somethign after");
    }

    @Override
    public void GiveChocolate() {
        System.out.println("do something before");
        pursuit.GiveChocolate();
        System.out.println("do somethign after");
    }
}
