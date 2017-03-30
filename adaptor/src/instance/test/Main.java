package instance.test;

import instance.adaptee.Center;
import instance.player.Forwards;
import instance.player.Player;
import instance.player.Translator;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args) {
        Player a = new Forwards("巴蒂尔");
        a.Attack();

        Center b = new Center("姚明");
        Player c = new Translator("翻译官", b);
        c.Attack();
        c.Defense();
    }
}
