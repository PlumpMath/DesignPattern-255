package instance.Website;

import instance.User.User;

/**
 * @author zmz
 */
public class ConcreteWebsite implements Website {
    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分裂："+name+"，用户："+user.getName());
    }
}
