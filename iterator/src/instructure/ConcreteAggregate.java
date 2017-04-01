package instructure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zmz
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> items = new ArrayList<T>();

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(this);
    }

    public T get(int index){
        return items.get(index);
    }

    public void add(T item){
        items.add(item);
    }


    public int size(){
        return items.size();
    }
}
