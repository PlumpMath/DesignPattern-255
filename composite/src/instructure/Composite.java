package instructure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zmz
 */
public class Composite extends Component {

    private List<Component> children;

    public Composite(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void Add(Component c) {
        children.add(c);
    }

    @Override
    public void Remove(Component c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {
        int n = depth;
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        while(n-->0){
            sb.append("- ");
        }
        sb.append(name);
        System.out.println(sb);

        for(Component c : children){
            c.Display(depth+2);
        }
    }
}
