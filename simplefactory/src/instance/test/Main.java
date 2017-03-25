package instance.test;

import instance.factory.OperationFactory;
import instance.product.Operation;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Operation oper = null;
        oper = OperationFactory.createOperate("+");
    }
}
