package factoryMethod;

import domain.Beef;
import domain.Chicken;
import domain.Meat;

/**
 * @author Arthur on 2021/9/8
 */
public class ChickenFactory implements MeatMethodFactory{

    @Override
    public Meat orderMeat() {
        return new Chicken("土雞");
    }
}
