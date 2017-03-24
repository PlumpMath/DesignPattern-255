package Instance.test;

import Instance.component.XiaoMing;
import Instance.decorator.BigTrouser;
import Instance.decorator.TShirts;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        XiaoMing xm = new XiaoMing("小明");

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.Decorate(xm);
        bigTrouser.Decorate(tShirts);
        bigTrouser.Show();
    }
}
