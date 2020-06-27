package burger_shop;

public class Meat {
    private String meatName;

    public static final Meat Beef = new Meat("beef");
    public static final Meat Chicken = new Meat("chicken");
    public static final Meat RoastBeef = new Meat("roast beef");
    public static final Meat BlackBean = new Meat("black bean");
    public static final Meat Steak = new Meat("steak");

    public Meat(String meatName) {
        this.meatName = meatName;
    }

    public String getMeatName() {
        return meatName;
    }
}
