package instance.test;

import instance.command.BakeChickenWingCommand;
import instance.command.BakeMuttonCommand;
import instance.command.Command;
import instance.invoker.Waitress;
import instance.receiver.Barbecuer;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Barbecuer boy = new Barbecuer();
        Waitress gril = new Waitress();

        gril.setOrder(new BakeMuttonCommand(boy));
        gril.setOrder(new BakeMuttonCommand(boy));
        gril.setOrder(new BakeChickenWingCommand(boy));

        gril.doDeal();
    }
}
