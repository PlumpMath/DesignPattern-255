package construct;

import java.util.ArrayList;

/**
 * @author zmz
 */
public class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    public void Attach(Observer observer){
        observers.add(observer);
    }
    public void Detach(Observer observer){
        observers.remove(observers.indexOf(observer));
    }

    public void Notify(){
        for(Observer observer : observers){
            observer.update();
        }
    }

}
