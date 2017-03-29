package instance.test;

import instance.event.EventHandler;
import instance.observer.NBAObserver;
import instance.observer.StockObserver;
import instance.subject.Boss;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        EventHandler handler = new EventHandler();
        StockObserver stock = new StockObserver("aaa");
        NBAObserver nba = new NBAObserver("bbb");

        Boss boss = new Boss("boss", handler);
        boss.addListener(stock, "CloseStockMarket");
        boss.addListener(nba, "CloseNBADirectSeeding");

        boss.NotifyAll();
    }
}
