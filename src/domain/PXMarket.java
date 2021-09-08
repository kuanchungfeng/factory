package domain;

import abstractFactory.DomesticFactory;
import factoryMethod.*;

/**
 * @author Arthur on 2021/9/8
 */
public class PXMarket {

    // 烤肉組合包
    public static void barbecueItemSet(){
        DomesticFactory domesticFactory = new DomesticFactory();
        buy("烤肉架");
        buy("木炭");
        buy(domesticFactory.supplyBeef().getName());
        buy(domesticFactory.supplyChicken().getName());
        buy(domesticFactory.supplyPork().getName());

    }

    public static void buyFish(){
        DomesticFactory domesticFactory = new DomesticFactory();
        buy(domesticFactory.supplyFish().getName());

    }

    public static void buy(String item){
        System.out.println("買到"+item+"了");
    }

}
