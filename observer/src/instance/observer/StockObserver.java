package instance.observer;

/**
 * @author zmz
 */
public class StockObserver {
    private String name;

    public StockObserver(String name) {
        this.name = name;
    }

    public void CloseStockMarket(){
        System.out.println(name+"，别看股票了，老板来了，快工作");
    }
}
