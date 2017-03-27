package instance.test;

import instance.director.HumanModelDirector;
import instance.product.HumanModel;
import instance.product.builder.HumanModerBuilder;
import instance.product.builder.impl.ConcreteHumanModelBuilder1;
import instance.product.builder.impl.ConcreteHumanModelBuilder2;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        HumanModelDirector director = new HumanModelDirector();
        HumanModerBuilder b1 = new ConcreteHumanModelBuilder1();
        HumanModerBuilder b2 = new ConcreteHumanModelBuilder2();

        director.construact(b1);
        HumanModel model1 = b1.getModel();
        model1.show();

        System.out.println("-------------------------------------");
        director.construact(b2);
        HumanModel model2 = b2.getModel();
        model2.show();
    }
}
