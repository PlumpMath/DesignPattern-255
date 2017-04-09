package instance.test;

import instance.elements.Person;
import instance.visitors.Action;

import java.util.ArrayList;

/**
 * @author zmz
 */
public class ObjectStructure {
    private ArrayList<Person> list = new ArrayList<Person>();

    public void attach(Person p){
        list.add(p);
    }

    public void dettach(Person p ){
        list.remove(p);
    }

    public void accept(Action action){
        for(Person p : list){
            p.accept(action);
        }
    }


}
