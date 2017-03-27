package construct;

import java.util.ArrayList;

/**
 * @author zmz
 */
public class Product {
    private ArrayList<String> list = new ArrayList<>();
    public void Add(String part){
        list.add(part);
    }

    public void show(){
        for(String s : list){
            System.out.println(s);
        }
    }
}
