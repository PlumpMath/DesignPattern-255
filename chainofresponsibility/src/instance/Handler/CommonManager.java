package instance.Handler;

import instance.test.Request;

/**
 * @author zmz
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if(request.getType().equals("请假") && request.getNum()<3){
            System.out.println(name+"批准了请假"+request.getNum()+"天的请求");
        }else if(superior!=null){
            superior.requestApplication(request);
        }else{
            System.out.println("请求失败");
        }
    }
}
