package instance.mediator;

import instance.country.Country;

import java.util.ArrayList;

/**
 * @author zmz
 */
public class SecurityCouncil implements UnitedNations {
    private ArrayList<Country> members = new ArrayList<>();

    public void addMember(Country c){
        members.add(c);
    }

    @Override
    public void declare(String msg, Country country) {
        for(Country c : members){
            if(c!=country){
                c.GetMsg(msg);
            }
        }
    }
}
