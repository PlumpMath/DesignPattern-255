package instance.test;

import instance.abstraction.HandsetBrand;
import instance.abstraction.HandsetBrandM;
import instance.abstraction.HandsetBrandN;
import instance.implementor.HandsetAddressList;
import instance.implementor.HandsetGame;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        HandsetBrand brand = new HandsetBrandM();
        aaa(brand);

        brand = new HandsetBrandN();
        aaa(brand);
    }

    public static void aaa(HandsetBrand brand){
        brand.setSoft(new HandsetGame());
        brand.run();
        brand.setSoft(new HandsetAddressList());
        brand.run();
    }
}
