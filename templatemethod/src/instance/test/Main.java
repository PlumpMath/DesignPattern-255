package instance.test;

import instance.template.Student1;
import instance.template.Student2;
import instance.template.TestPaper;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        TestPaper p = null;
        p = new Student1();
        p.Question1();
        p.Question2();

        p = new Student2();
        p.Question1();
        p.Question2();
    }
}
