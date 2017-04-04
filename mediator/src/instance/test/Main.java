package instance.test;

import instance.country.Iraq;
import instance.country.USA;
import instance.mediator.SecurityCouncil;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        SecurityCouncil s = new SecurityCouncil();
        USA usa = new USA(s);
        Iraq iraq = new Iraq(s);

        s.addMember(usa);
        s.addMember(iraq);

        usa.declare("不准研制核武器，否则揍你");
        iraq.declare("不服来干");
    }
}
