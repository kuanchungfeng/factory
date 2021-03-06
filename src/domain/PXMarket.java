package domain;

import abstractFactory.AbstractFactory;
import abstractFactory.DomesticFactory;
import abstractFactory.ImportFactory;
import factoryMethod.*;

/**
 * @author Arthur on 2021/9/8
 */
public class PXMarket {

    // 烤肉組合包
    public static void barbecueItemSet(){
        AbstractFactory factory = new ImportFactory();
        buy("烤肉架");
        buy("木炭");
        buy(factory.supplyBeef().getName());
        buy(factory.supplyChicken().getName());
        buy(factory.supplyPork().getName());

    }

    public static void buyFish(){
        DomesticFactory domesticFactory = new DomesticFactory();
        buy(domesticFactory.supplyFish().getName());

    }

    public static void buy(String item){
        System.out.println("買到"+item+"了");
    }

}
