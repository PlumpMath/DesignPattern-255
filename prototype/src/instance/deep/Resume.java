package instance.deep;

import instance.shallow.Experience;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zmz
 */
public class Resume implements Cloneable,Serializable {
    private String name;
    private String age;
    private String gender;
    private Set<Experience> experience = new HashSet<>();

    @Override
    public Object clone(){
        Object obj = null;
        try {
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oss = new ObjectOutputStream(bao);
            oss.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            obj = ois.readObject();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
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
