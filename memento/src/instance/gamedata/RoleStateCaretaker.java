package instance.gamedata;

import instance.gameDataBackup.RoleStateMemento;

/**
 * @author zmz
 */
public class RoleStateCaretaker {
    private RoleStateMemento mem;

    public RoleStateMemento getMem() {
        return mem;
    }

    public void setMem(RoleStateMemento mem) {
        this.mem = mem;
    }
}
