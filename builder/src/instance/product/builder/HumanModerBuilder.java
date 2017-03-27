package instance.product.builder;

import instance.product.HumanModel;

/**
 * @author zmz
 */
public interface HumanModerBuilder {
    void setHead();
    void setBody();
    void setLeftHand();
    void setRightHand();
    void setLeftFoot();
    void setRightFoot();
    HumanModel getModel();
}
