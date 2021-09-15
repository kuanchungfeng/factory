package abstractFactory;

import domain.*;


/**
 * @author Arthur on 2021/9/8
 */
public class DomesticFactory implements AbstractFactory{
    @Override
    public DomesticBeef supplyBeef() {
        return new DomesticBeef("國產牛肉");
    }

    @Override
    public DomesticChicken supplyChicken() {
        return new DomesticChicken("國產雞肉");
    }

    @Override
    public DomesticPork supplyPork() {
        return new DomesticPork("國產豬肉");
    }

    @Override
    public DomesticFish supplyFish() {
        return new DomesticFish("國產鯖魚");
    }
}
