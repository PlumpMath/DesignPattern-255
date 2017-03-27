package instance.director;

import instance.product.builder.HumanModerBuilder;

/**
 * @author zmz
 */
public class HumanModelDirector {
    public void construact(HumanModerBuilder builder){
        builder.setHead();
        builder.setBody();
        builder.setLeftHand();
        builder.setRightHand();
        builder.setLeftFoot();
        builder.setRightFoot();
    }
}
