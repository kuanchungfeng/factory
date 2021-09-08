package simpleFactory;

import domain.Beef;
import domain.Chicken;
import domain.Meat;
import domain.Pork;

/**
 * @author Arthur on 2021/9/8
 */
public class SimpleMeatFactory {

    public static Meat orderBarbecue(String meatType){
        if(meatType.equals("牛肉")){
            return new Beef("和牛");
        }else if(meatType.equals("雞肉")){
            return new Chicken("土雞");
        }else {
            return new Pork("伊比利豬");
        }
    }
}
