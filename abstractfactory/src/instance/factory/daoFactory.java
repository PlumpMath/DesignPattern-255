package instance.factory;

/**
 * @author zmz
 */
public class daoFactory {

    private daoFactory(){}

    private static volatile daoFactory instance;

    public static daoFactory getInstance(){
        if(null==instance){
            synchronized (daoFactory.class){
                if(null==instance){
                    instance = new daoFactory();
                }
            }
        }
        return instance;
    }

    public <T> T createDao(String className, Class<T> clazz){
        try {
            T t = (T)Class.forName(className).newInstance();
            return t;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
