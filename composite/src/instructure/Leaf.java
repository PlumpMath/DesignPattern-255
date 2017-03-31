package instructure;

/**
 * @author zmz
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        System.out.println("叶结点不能添加组件");
    }

    @Override
    public void Remove(Component c) {
        System.out.println("叶结点没有组件");
    }

    @Override
    public void Display(int depth) {
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        while(depth-->0){
            sb.append("- ");
        }
        sb.append(name);
        System.out.println(sb.toString());
    }
}
