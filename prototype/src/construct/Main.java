package construct;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Prototype prototype = new Prototype("idididididid", new Demo1());
        Prototype copy = (Prototype)prototype.clone();
        
        System.out.println(prototype.getId()==copy.getId());
        System.out.println(prototype.getDemo1()==copy.getDemo1());
        System.out.println(prototype==copy);
    }
}
