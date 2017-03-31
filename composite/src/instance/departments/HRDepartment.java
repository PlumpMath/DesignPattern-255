package instance.departments;

/**
 * @author zmz
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
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
        System.out.println(name+"负责招聘员工培训管理");
    }
}
