package abstractFactory;

import domain.*;


/**
 * @author Arthur on 2021/9/8
 */
public class ImportFactory implements AbstractFactory{
    @Override
    public ImportBeef supplyBeef() {
        return new ImportBeef("進口和牛");
    }

    @Override
    public ImportChicken supplyChicken() {
        return new ImportChicken("進口雞肉");
    }

    @Override
    public ImportPork supplyPork() {
        return new ImportPork("進口豬肉");
    }

    @Override
    public ImportFish supplyFish() {
        return new ImportFish("進口鯖魚");
    }
}
