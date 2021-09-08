package domain;

/**
 * @author Arthur on 2021/9/8
 */
public abstract class Meat {

    private String name;

    private int oz;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOz() {
        return oz;
    }

    public void setOz(int oz) {
        this.oz = oz;
    }

    public Meat(String name) {
        this.name = name;
    }

    public Meat(){

    }
}
