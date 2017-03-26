package instance.shallow;

import java.io.Serializable;

/**
 * @author zmz
 */
public class Experience implements Serializable {
    private String date;
    private String comppany;
    private String description;

    public Experience(String date, String comppany, String description) {
        this.date = date;
        this.comppany = comppany;
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString()+" "+date+" "+comppany+" "+description;
    }
}
