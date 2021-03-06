package burger_shop;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        main execution of the burger shop goes here.  This is the "entry point" of your application

        Order myOrder = new Order(Burger.Health, Bread.Wheat, Meat.Steak);
        myOrder.addToppings(Topping.Bacon);
        myOrder.addToppings(Topping.Cheese);
        myOrder.addToppings(Topping.Carrots);
        myOrder.addToppings(Topping.Lettuce);
        myOrder.addToppings(Topping.Tomatoes);
        myOrder.addToppings(Topping.Onions);
        myOrder.addToppings(Topping.Ketchup);
        myOrder.printOrderTotal();
    }
}
