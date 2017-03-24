package construct;

/**
 * @author zmz
 */
public class ConcreteComponent implements Component {
    @Override
    public void Operation() {
        System.out.println("具体的对象操作");
    }
}
