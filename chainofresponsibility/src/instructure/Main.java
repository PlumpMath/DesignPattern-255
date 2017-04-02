package instructure;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setSuccessor(h2);

        int[] testcase = new int[]{2,5,33,12,-1,14,2};
        for(int i : testcase){
            h1.HandleRequest(i);
        }
    }
}
