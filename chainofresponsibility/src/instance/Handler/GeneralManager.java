package instance.Handler;

import instance.test.Request;

/**
 * @author zmz
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if(request.getType().equals("请假")){
            System.out.println(name+"批准了请假"+request.getNum()+"天的请求");
        }else if(request.getType().equals("加薪")){
            if(request.getNum()<500){
                System.out.println(name+"批准了加薪"+request.getNum()+"元的请求");
            }else{
                System.out.println("加薪？呵呵呵呵呵呵呵");
            }
        }
        else if(superior!=null){
            superior.requestApplication(request);
        }else{
            System.out.println("请求失败");
        }
    }
}
