package instance.command;

import instance.receiver.Barbecuer;

/**
 * @author zmz
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.BakeChickenWingCommand();
    }
}
