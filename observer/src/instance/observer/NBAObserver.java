package instance.observer;

/**
 * @author zmz
 */
public class NBAObserver {
    private String name;

    public NBAObserver(String name) {
        this.name = name;
    }

    public void CloseNBADirectSeeding(){
        System.out.println(name+"，老板来了，别看NBA了，快工作");
    }
}
