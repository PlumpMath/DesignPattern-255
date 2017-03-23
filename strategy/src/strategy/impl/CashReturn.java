package strategy.impl;

import strategy.CashSuper;

/**
 * @author zmz
 */
public class CashReturn implements CashSuper{

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double subtotal = money;
        if(money>=moneyCondition){
            subtotal = money-Math.floor(money/moneyCondition)*moneyReturn;
        }
        return subtotal;
    }
}
