package burger_shop;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        Burger hamburger = new Burger("My Burger", "Beef", "Wheat");
        hamburger.addBurgerTopping1("Bacon", 1.00);
        hamburger.addBurgerTopping2("Ranch", .20);
        System.out.println("Plain burger price: $" + hamburger.plainBurgerPrice());
        System.out.println("Total price after toppings: $" + hamburger.totalBurgerPrice());
    }
}
