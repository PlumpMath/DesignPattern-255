package instance.departments;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zmz
 */
public class ConcreteCompany extends Company {
    private List<Company> list;

    public ConcreteCompany(String name) {
        super(name);
        list = new ArrayList<>();
    }

    @Override
    public void Add(Company c) {
        list.add(c);
    }

    @Override
    public void Remove(Company c) {
        list.add(c);
    }

    @Override
    public void Display(int depth) {
        int n = depth;
        StringBuilder sb = new StringBuilder("|");
        while(n-->0){
            sb.append("- ");
        }
        sb.append(name);
        System.out.println(sb);

        for(Company c : list){
            c.Display(depth+2);
        }
    }

    @Override
    public void LineOfDuty() {
        for(Company c : list){
            c.LineOfDuty();
        }
    }
}
