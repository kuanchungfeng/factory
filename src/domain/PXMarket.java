package domain;

import simpleFactory.SimpleMeatFactory;

/**
 * @author Arthur on 2021/9/8
 */
public class PXMarket {

    // 烤肉組合包
    public static void barbecueItemSet(){
        buy("烤肉架");
        buy("木炭");
        buy(SimpleMeatFactory.orderBarbecue("牛肉").getName());
        buy(SimpleMeatFactory.orderBarbecue("豬肉").getName());
        buy(SimpleMeatFactory.orderBarbecue("雞肉").getName());
    }

    public static void buy(String item){
        System.out.println("買到"+item+"了");
    }
}
