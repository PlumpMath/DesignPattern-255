package instance.Dao;

/**
 * @author zmz
 */
public interface BaseDao<T> {
    public abstract void add(T t);
    public abstract void delete(T t);
    public abstract void update(T t);
    public abstract void select(T t);
}
