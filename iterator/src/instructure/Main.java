package instructure;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        ConcreteAggregate<String> list = new ConcreteAggregate<>();
        list.add("大鸟");
        list.add("小菜");
        list.add("上岛咖啡");
        list.add("卍解");

        Iterator<String> i = list.iterator();
        while(!i.isDone()){
            System.out.println(i.next()+"，买票");
        }
    }
}
