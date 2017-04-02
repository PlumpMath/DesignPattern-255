package instance.command;

import instance.receiver.Barbecuer;

/**
 * @author zmz
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
