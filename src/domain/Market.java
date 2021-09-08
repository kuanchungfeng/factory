package domain;

/**
 * @author Arthur on 2021/9/8
 */
public class Market {

    // 烤肉組合包
    public static void barbecueItemSet(){
        buy("烤肉架");
        buy("木炭");
        buy(orderBarbecue("牛肉").getName());
        buy(orderBarbecue("豬肉").getName());
        buy(orderBarbecue("雞肉").getName());

    }

    static Meat orderBarbecue(String meatType){
        if(meatType.equals("牛肉")){
            return new Beef("和牛");
        }else if(meatType.equals("雞肉")){
            return new Chicken("土雞");
        }else {
            return new Pork("伊比利豬");
        }
    }

    public static void buy(String item){
        System.out.println("買到"+item+"了");
    }
}
