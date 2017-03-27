package instance.product.builder.impl;

import instance.product.HumanModel;
import instance.product.builder.HumanModerBuilder;

/**
 * @author zmz
 */
public class ConcreteHumanModelBuilder2 implements HumanModerBuilder{
    private HumanModel model = new HumanModel();

    public HumanModel getModel() {
        return model;
    }

    @Override
    public void setHead() {
        model.setHead("head model 2");
    }

    @Override
    public void setBody() {
        model.setBody("body model 2");
    }

    @Override
    public void setLeftHand() {
        model.setLefthand("left hand model 2");
    }

    @Override
    public void setRightHand() {
        model.setRighthand("right hand model 2");
    }

    @Override
    public void setLeftFoot() {
        model.setLeftfoot("left foot model 2");
    }

    @Override
    public void setRightFoot() {
        model.setRightfoot("right foot model 2");
    }
}
