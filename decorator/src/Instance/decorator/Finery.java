package Instance.decorator;

import Instance.component.Person;
import construct.Decorator;

/**
 * @author zmz
 */
public class Finery implements Person{
    protected Person component;

    public void Decorate(Person component){
        this.component = component;
    }

    @Override
    public void Show() {
        if(component!=null){
            component.Show();
        }
    }
}
