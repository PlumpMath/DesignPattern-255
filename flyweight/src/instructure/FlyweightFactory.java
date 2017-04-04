package instructure;

import java.util.HashMap;

/**
 * @author zmz
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.putIfAbsent("X",new ConcreteFlyweight());
        flyweights.putIfAbsent("Y",new ConcreteFlyweight());
        flyweights.putIfAbsent("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyWeight(String key){
        return flyweights.get(key);
    }
}
