package construct;

/**
 * @author zmz
 */
public class Prototype implements Cloneable {

    private String id;
    private Demo1 demo1;

    public Prototype(String id, Demo1 demo) {
        this.id = id;
        this.demo1 = demo;
    }

    public String getId() {
        return id;
    }

    public Demo1 getDemo1(){
        return demo1;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class Demo1{}
