package instance.Test;

import instance.factory.Factory;
import instance.factory.UndergraduateFactory;
import instance.factory.VolunteerFactory;
import instance.product.LeiFeng;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        System.out.println("周一");
        Factory studentFactory = new UndergraduateFactory();
        LeiFeng lf_student = studentFactory.CreateLeiFeng();
        lf_student.Sweep();
        lf_student.Wash();
        lf_student.BuyRice();

        System.out.println("周二");
        Factory volunteerFactory = new VolunteerFactory();
        LeiFeng lf_volunteer = volunteerFactory.CreateLeiFeng();
        lf_volunteer.Sweep();
        lf_volunteer.Wash();
        lf_volunteer.BuyRice();
    }
}
