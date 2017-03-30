package instance.player;

import instance.adaptee.Center;

/**
 * @author zmz
 */
public class Translator extends Player {

    private Center target;

    public Translator(String name, Center target) {
        super(name);
        this.target = target;
    }

    @Override
    public void Attack() {
        System.out.print(name+"翻译：");
        target.Attack();
    }

    @Override
    public void Defense() {
        System.out.print(name+"翻译：");
        target.Defense();
    }
}
