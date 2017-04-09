package instructure;

import java.util.ArrayList;

/**
 * @author zmz
 */
public class ObjectStructure {
    /*
     * 能枚举它的元素，提供一个高层的接口以允许访问者访问它的元素
     */
    private ArrayList<Element> elements = new ArrayList<Element>();

    public void attach(Element e){
        elements.add(e);
    }

    public void detach(Element e){
        elements.remove(e);
    }

    public void accept(Visitor visitor){
        for(Element e : elements){
            e.accept(visitor);
        }
    }

}
