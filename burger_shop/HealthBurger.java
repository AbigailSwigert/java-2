package burger_shop;

import java.text.DecimalFormat;

public class HealthBurger extends Burger {

    private static DecimalFormat priceFormat = new DecimalFormat("##0.00");

    private String[] healthyToppings = {"Lettuce", "Tomatoes", "Carrots", "Guacamole", "Pickles"};

    public HealthBurger(String meat) {
        super( meat, Bread.Lettuce);
        this.setBurgerName("Healthy");
        this.setBurgerPrice(4.50);
        this.setMaxToppings(4);
    }

    @Override
    public void addToppings(Toppings topping) {
        if(topping.isHealthy()) {
            super.addToppings(topping);
        } else {
            System.out.println(topping.getToppingName() + " is not healthy and cannot be ordered on the Healthy " +
                    "Burger.");
        }
    }
}