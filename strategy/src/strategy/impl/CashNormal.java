package strategy.impl;

import strategy.CashSuper;

/**
 * @author zmz
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
