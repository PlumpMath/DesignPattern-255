package instance.test;

import instance.shallow.Experience;
import instance.shallow.Resume;

/**
 * @author zmz
 */
public class Main1 {
    public static void main(String[] args){
        Resume a = new Resume();
        a.setName("zmz");
        a.setAge("18");
        a.setGender("man");
        a.getExperience().add(new Experience("0-1","aaa","hehehehehe"));

        System.out.println(a.toString());
        System.out.println("-----------------------------");

        try {
            Resume b = (Resume)a.clone();
            b.getExperience().add(new Experience("3-3","bbb","hahahahaha"));
            System.out.println(a.toString());
            System.out.println(b.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
