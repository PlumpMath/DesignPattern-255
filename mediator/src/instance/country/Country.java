package instance.country;

import instance.mediator.UnitedNations;

/**
 * @author zmz
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }

    public abstract void GetMsg(String msg);
}
