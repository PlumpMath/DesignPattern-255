package instructure;

/**
 * @author zmz
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public void HandleRequest(int request) {
        if(request>10 && request<20){
            System.out.println(this.getClass().toString()+"处理请求"+request);
        }else if(successor!=null){
            successor.HandleRequest(request);
        }else{
            System.out.println("请求处理失败");
        }
    }
}
