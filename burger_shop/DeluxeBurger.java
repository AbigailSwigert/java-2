package burger_shop;

import java.text.DecimalFormat;

public class DeluxeBurger extends Burger {

    private static DecimalFormat priceFormat = new DecimalFormat("##0.00");

    public DeluxeBurger(String meat, Bread breadRollType) {
        super(meat, breadRollType);
        this.setBurgerName("Deluxe");
        this.setBurgerPrice(4.99);
        this.setMaxToppings(6);
    }

}
