package factoryMethod;

import domain.Beef;
import domain.Meat;
import domain.Pork;

/**
 * @author Arthur on 2021/9/8
 */
public class PorkFactory implements MeatMethodFactory{

    @Override
    public Meat orderMeat() {
        return new Pork("伊比利豬");
    }
}
