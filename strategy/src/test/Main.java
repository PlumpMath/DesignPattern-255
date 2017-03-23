package test;

import Context.CashContext;

import java.util.ArrayList;

/**
 * @author zmz
 */
public class Main {

    public static void main(String[] args){
        double money = 500d;
        //普通收费
        CashContext cs1 = new CashContext();
        System.out.println("普通收费："+cs1.GetResult(money));

        //打八折
        CashContext cs2 = new CashContext("0.8");
        System.out.println("打八折："+cs2.GetResult(money));

        //满300减100
        CashContext cs3 = new CashContext("300", "100");
        System.out.println("满减："+cs3.GetResult(money));
    }
}
