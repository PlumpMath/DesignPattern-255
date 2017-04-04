package instance.Website;

import java.util.HashMap;

/**
 * @author zmz
 */
public class WebsiteFactory {
    private HashMap<String,Website> websites = new HashMap<>();

    public Website getWebsiteCategory(String key){
        websites.putIfAbsent(key, new ConcreteWebsite(key));
        return websites.get(key);
    }

    public int getWebsiteCategoryCount(){
        return websites.size();
    }
}
