package instance.product;

/**
 * @author zmz
 */
public class HumanModel {
    private String head;
    private String body;
    private String lefthand;
    private String righthand;
    private String leftfoot;
    private String rightfoot;

    public void show(){
        System.out.println("I have a head: "+head);
        System.out.println("I have a body: "+body);
        System.out.println("I have two hands: "+lefthand+" "+righthand);
        System.out.println("I have two feet: "+leftfoot+" "+rightfoot);
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setLefthand(String lefthand) {
        this.lefthand = lefthand;
    }

    public void setRighthand(String righthand) {
        this.righthand = righthand;
    }

    public void setLeftfoot(String leftfoot) {
        this.leftfoot = leftfoot;
    }

    public void setRightfoot(String rightfoot) {
        this.rightfoot = rightfoot;
    }
}
