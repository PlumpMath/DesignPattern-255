package instance.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zmz
 */
public class Event {
    private Object obj;
    private String method;
    private Object[] params;
    private Class[] paramTypes;

    public Event(){}

    public Event(Object obj, String method, Object... args){
        this.obj = obj;
        this.method = method;
        this.params = args;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params){
        this.paramTypes = new Class[params.length];
        for(int i=0; i<params.length; i++){
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke(){
        try {
            Method meth = obj.getClass().getMethod(method, paramTypes);
            if(null == meth) return;
            meth.invoke(obj, params);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
