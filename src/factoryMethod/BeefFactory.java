package factoryMethod;

import domain.Beef;
import domain.Meat;

/**
 * @author Arthur on 2021/9/8
 */
public class BeefFactory implements MeatMethodFactory{

    @Override
    public Meat orderMeat() {
        return new Beef("和牛");
    }
}
