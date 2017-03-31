package instructure;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Originator o = new Originator();
        o.setState("On");
        o.Show();

        System.out.println("存档");
        Caretaker c = new Caretaker();
        c.setMem(o.CreateMemento());

        System.out.println("状态改变");
        o.setState("Off");
        o.Show();

        System.out.println("读档");
        o.setMemento(c.getMem());
        o.Show();
    }
}
