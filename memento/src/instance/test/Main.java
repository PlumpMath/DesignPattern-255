package instance.test;

import instance.gamedata.GameRole;
import instance.gamedata.RoleStateCaretaker;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        GameRole user = new GameRole();
        user.setAtk(100);
        user.setVit(100);
        user.setDef(100);

        user.Show();

        //存档
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMem(user.Save());

        System.out.println("存档后状态改变");
        user.setVit(500);
        user.setVit(500);
        user.setDef(500);
        user.Show();

        System.out.println("读档");
        user.Recovery(caretaker.getMem());
        user.Show();
    }
}
