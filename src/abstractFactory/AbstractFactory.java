package abstractFactory;

import domain.Beef;
import domain.Chicken;
import domain.Fish;
import domain.Pork;

/**
 * @author Arthur on 2021/9/8
 */
public interface AbstractFactory {

    public Beef supplyBeef();

    public Chicken supplyChicken();

    public Pork supplyPork();

    public Fish supplyFish();
}
