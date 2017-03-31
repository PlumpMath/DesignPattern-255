package instance.departments;

/**
 * @author zmz
 */
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void Add(Company c) {
        System.out.println("ERROR");
    }

    @Override
    public void Remove(Company c) {
        System.out.println("ERROR");
    }

    @Override
    public void Display(int depth) {
        StringBuilder sb = new StringBuilder("|");
        while(depth-->0){
            sb.append("- ");
        }
        sb.append(name);
        System.out.println(sb);
    }

    @Override
    public void LineOfDuty() {
        System.out.println(name+"负责公司裁财务管理");
    }
}
