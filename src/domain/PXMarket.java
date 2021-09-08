package domain;

import factoryMethod.*;

/**
 * @author Arthur on 2021/9/8
 */
public class PXMarket {

    // 烤肉組合包
    public static void barbecueItemSet(){
        buy("烤肉架");
        buy("木炭");
        BeefFactory beefFactory = new BeefFactory();
        buy(callFactory(beefFactory).getName());
        ChickenFactory chickenFactory = new ChickenFactory();
        buy(callFactory(chickenFactory).getName());
        PorkFactory porkFactory = new PorkFactory();
        buy(callFactory(porkFactory).getName());
    }

    public static void buyFish(){
        FishFactory fishFactory = new FishFactory();
        buy(callFactory(fishFactory).getName());
    }

    public static void buy(String item){
        System.out.println("買到"+item+"了");
    }

    public static Meat callFactory(MeatMethodFactory factory){
        return factory.orderMeat();
    }
}
