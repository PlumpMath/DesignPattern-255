package instance.shallow;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zmz
 */
public class Resume implements Cloneable {
    private String name;
    private String age;
    private String gender;
    private Set<Experience> experience = new HashSet<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString()+" "+name+" "+age+" "+gender+" "
                +experience.size();
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Set<Experience> getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
