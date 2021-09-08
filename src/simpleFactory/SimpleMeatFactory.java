package simpleFactory;

import domain.*;

/**
 * @author Arthur on 2021/9/8
 */
public class SimpleMeatFactory {

    public static Meat orderBarbecue(String meatType){
        if(meatType.equals("牛肉")){
            return new Beef("和牛");
        }else if(meatType.equals("雞肉")){
            return new Chicken("土雞");
        }else if(meatType.equals("魚肉")){
            return new Fish("鯖魚");
        }else {
            return new Pork("伊比利豬");
        }
    }
}
