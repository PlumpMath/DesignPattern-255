package instructure;

/**
 * @author zmz
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private ConcreteAggregate<T> aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> aggregate){
        this.aggregate = aggregate;
    }

    @Override
    public T first() {
        return aggregate.get(0);
    }

    @Override
    public T next() {
        if(current < aggregate.size()){
            return aggregate.get(current++);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return current<aggregate.size()?false:true;
    }

    @Override
    public T currentItem() {
        return aggregate.get(current);
    }
}
