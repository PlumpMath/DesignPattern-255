package instance.invoker;

import instance.command.BakeMuttonCommand;
import instance.command.Command;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author zmz
 */
public class Waitress {
    private ArrayList<Command> orders = new ArrayList<>();

    public void setOrder(Command command){
        if(command instanceof BakeMuttonCommand){
            orders.add(command);
            System.out.println("增加订单："+command.toString()+"，时间："+new Date().toString());
        }else{
            System.out.println("服务员：没有鸡翅了");
        }
    }

    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("取消订单："+command.toString()+"，时间："+new Date().toString());
    }

    public void doDeal(){
        for(Command cmd : orders){
            cmd.execute();
        }
    }

}
