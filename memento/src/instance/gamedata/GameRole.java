package instance.gamedata;

import instance.gameDataBackup.RoleStateMemento;

/**
 * @author zmz
 */
public class GameRole {
    private int vit; //生命力
    private int atk; //攻击力
    private int def; //防御力

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    //存档
    public RoleStateMemento Save(){
        return new RoleStateMemento(vit, atk, def);
    }

    //读档
    public void Recovery(RoleStateMemento mem){
        this.vit = mem.getVit();
        this.atk = mem.getAtk();
        this.def = mem.getDef();
    }

    public void Show(){
        System.out.println("生命值："+vit+"\t攻击力："+atk+"\t防御力："+def);
    }
}
