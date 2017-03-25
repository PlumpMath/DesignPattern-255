package instance.factory;

import instance.product.LeiFeng;
import instance.product.Undergraduate;

/**
 * @author zmz
 */
public class UndergraduateFactory implements Factory{
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Undergraduate();
    }
}
