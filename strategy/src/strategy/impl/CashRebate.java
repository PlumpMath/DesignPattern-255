package strategy.impl;

import strategy.CashSuper;

/**
 * @author zmz
 */
public class CashRebate implements CashSuper{
    private double moneyRebate;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
