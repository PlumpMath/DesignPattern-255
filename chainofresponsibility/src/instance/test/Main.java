package instance.test;

import instance.Handler.CommonManager;
import instance.Handler.GeneralManager;
import instance.Handler.Majordomo;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        CommonManager commonManager = new CommonManager("经理");
        Majordomo majordemo = new Majordomo("总监");
        commonManager.setSuperior(majordemo);
        GeneralManager generalManager = new GeneralManager("总经理");
        majordemo.setSuperior(generalManager);

        Request req1 = new Request();
        req1.setType("请假");
        req1.setNum(2);
        commonManager.requestApplication(req1);

        req1.setNum(4);
        commonManager.requestApplication(req1);

        req1.setNum(10);
        commonManager.requestApplication(req1);

        req1.setType("加薪");
        req1.setNum(5);
        commonManager.requestApplication(req1);

        req1.setType("加薪");
        req1.setNum(50000);
        commonManager.requestApplication(req1);

    }
}
