package instance.Test;

import instance.proxy.Pursuit;
import instance.subject.Proxy;

/**
 * @author zmz
 */
public class Main {
    public static void main(String[] args){
        Pursuit pursuit = new Pursuit("aaa");
        Proxy proxy = new Proxy(pursuit);
        proxy.GiveChocolate();
        proxy.GiveFlowers();
        proxy.GiveDlls();
    }
}
