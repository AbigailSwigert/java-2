package burger_shop;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Main {

    private static DecimalFormat priceFormat = new DecimalFormat("##0.00");

    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        Burger hamburger = new Burger("Plain", "Beef", "Wheat");
        hamburger.addBurgerTopping1("Bacon", 1.00);
        hamburger.addBurgerTopping2("Ranch", .20);
        System.out.println("Plain burger price: $" + priceFormat.format(hamburger.plainBurgerPrice()));
        System.out.println("Total price after toppings: $" + priceFormat.format(hamburger.totalBurgerPrice()));

        DeluxeBurger deluxeBurger = new DeluxeBurger("White");
        deluxeBurger.addBurgerTopping1("Bacon", 1.00);
        deluxeBurger.addBurgerTopping2("top2", .25);
        deluxeBurger.addBurgerTopping3("top3", .3);
        deluxeBurger.addBurgerTopping4("top4", .15);
        deluxeBurger.addBurgerTopping5("top5", .90);
        deluxeBurger.addBurgerTopping6("lastTopp", .87);
        System.out.println("Deluxe Buger price: $" + priceFormat.format(deluxeBurger.plainBurgerPrice()));
        System.out.println("Total price after toppings: $" + priceFormat.format(deluxeBurger.totalBurgerPrice()));

        HealthBurger healthy = new HealthBurger("Chicken");
        healthy.addHealthyTopping1("Lettuce", .25);
        healthy.addHealthyTopping2("Tomatoes", .15);
        healthy.addHealthyTopping3("Egg", 1.25);
        healthy.addHealthyTopping4("Pickles", .15);
        System.out.println("Healthy Buger price: $" + priceFormat.format(healthy.plainBurgerPrice()));
        System.out.println("Total after toppings: $" + priceFormat.format(healthy.totalBurgerPrice()));
    }
}
