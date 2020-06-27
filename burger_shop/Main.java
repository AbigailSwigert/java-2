package burger_shop;

public class Main {

    public static void main(String[] args) {
//        main execution of the burger shop goes here.  This is the "entry point" of your application

        Order myOrder = new Order(Burger.Deluxe, Bread.Wheat, Meat.Steak);
        myOrder.addToppings(Topping.Bacon);
        myOrder.addToppings(Topping.Cheese);
        myOrder.addToppings(Topping.Bacon);
        myOrder.addToppings(Topping.Carrots);
        myOrder.printOrderTotal();

    }
}
