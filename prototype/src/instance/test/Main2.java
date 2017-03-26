package instance.test;

import instance.deep.Resume;
import instance.shallow.Experience;

/**
 * @author zmz
 */
public class Main2 {
    public static void main(String[] args){
        Resume a = new Resume();
        a.setName("zmz");
        a.setAge("18");
        a.setGender("man");
        a.getExperience().add(new Experience("0-1","aaa","hehehehehe"));

        System.out.println(a.toString());
        System.out.println("-----------------------------");

        Resume b = (Resume)a.clone();
        b.getExperience().add(new Experience("3-3","bbb","hahahahaha"));
        System.out.println(a.toString());
        System.out.println(b.toString());

    }
}
