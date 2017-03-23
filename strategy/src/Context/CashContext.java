package Context;

import strategy.CashSuper;
import strategy.impl.CashNormal;
import strategy.impl.CashRebate;
import strategy.impl.CashReturn;

/**
 * @author zmz
 */
public class CashContext {
    private CashSuper cs;
    public CashContext(){
        this.cs = new CashNormal();
    }

    public CashContext(String moneyRebate){
        this.cs = new CashRebate(moneyRebate);
    }

    public CashContext(String moneyCondition, String moneyReturn){
        this.cs = new CashReturn(moneyCondition, moneyReturn);
    }

    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}
