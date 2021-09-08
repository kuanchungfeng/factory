package abstractFactory;

import domain.Beef;
import domain.Chicken;
import domain.Fish;
import domain.Pork;

/**
 * @author Arthur on 2021/9/8
 */
public class DomesticFactory implements AbstractFactory{
    @Override
    public Beef supplyBeef() {
        return new Beef("國產牛肉");
    }

    @Override
    public Chicken supplyChicken() {
        return new Chicken("國產雞肉");
    }

    @Override
    public Pork supplyPork() {
        return new Pork("國產豬肉");
    }

    @Override
    public Fish supplyFish() {
        return new Fish("國產鯖魚");
    }
}
