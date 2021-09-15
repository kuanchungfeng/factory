package abstractFactory;

import domain.*;


/**
 * @author Arthur on 2021/9/8
 */
public interface AbstractFactory {

    public Beef supplyBeef();

    public Chicken supplyChicken();

    public Pork supplyPork();

    public Fish supplyFish();
}
