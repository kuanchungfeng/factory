package abstractFactory;

import domain.Beef;
import domain.Chicken;
import domain.Fish;
import domain.Pork;

/**
 * @author Arthur on 2021/9/8
 */
public class ImportFactory implements AbstractFactory{
    @Override
    public Beef supplyBeef() {
        return new Beef("進口和牛");
    }

    @Override
    public Chicken supplyChicken() {
        return new Chicken("進口雞肉");
    }

    @Override
    public Pork supplyPork() {
        return new Pork("進口豬肉");
    }

    @Override
    public Fish supplyFish() {
        return new Fish("進口鯖魚");
    }
}
