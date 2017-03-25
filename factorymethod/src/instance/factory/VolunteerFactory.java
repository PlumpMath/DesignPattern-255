package instance.factory;

import instance.product.LeiFeng;
import instance.product.Volunteer;

/**
 * @author zmz
 */
public class VolunteerFactory implements Factory {
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Volunteer();
    }
}
