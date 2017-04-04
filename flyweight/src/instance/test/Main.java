package instance.test;

import com.sun.javafx.webkit.WebPageClientImpl;
import instance.User.User;
import instance.Website.Website;
import instance.Website.WebsiteFactory;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        WebsiteFactory f = new WebsiteFactory();
        Website fx = f.getWebsiteCategory("产品展示");
        fx.use(new User("aaa"));

        Website fy = f.getWebsiteCategory("产品展示");
        fy.use(new User("bbb"));

        Website fz = f.getWebsiteCategory("博客");
        fz.use(new User("ccc"));

        System.out.println(f.getWebsiteCategoryCount());
    }
}
