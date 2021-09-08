package factoryMethod;

import domain.Beef;
import domain.Fish;
import domain.Meat;

/**
 * @author Arthur on 2021/9/8
 */
public class FishFactory implements MeatMethodFactory{

    @Override
    public Meat orderMeat() {
        return new Fish("鯖魚");
    }
}
