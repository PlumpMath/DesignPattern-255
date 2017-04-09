package instance.test;


import instance.elements.Man;
import instance.elements.Woman;
import instance.visitors.Amativeness;
import instance.visitors.Failing;
import instance.visitors.Success;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success successState = new Success();
        o.accept(successState);

        Failing failState = new Failing();
        o.accept(failState);

        Amativeness amativeState = new Amativeness();
        o.accept(amativeState);
    }
}
