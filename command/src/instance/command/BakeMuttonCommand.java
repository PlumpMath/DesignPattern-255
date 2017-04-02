package instance.command;

import instance.receiver.Barbecuer;

/**
 * @author zmz
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.BakeMutton();
    }
}
