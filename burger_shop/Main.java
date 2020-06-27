package burger_shop;

public class Main {

    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application
        Burger hamburger = new Burger("Beef", Bread.Wheat);
        hamburger.printPlainBurgerPrice();
        hamburger.addToppings(Toppings.Cheese);
        hamburger.addToppings(Toppings.Pickles);
        hamburger.addToppings(Toppings.Carrots); // 3rd topping, will not add
        hamburger.addToppings(Toppings.Tomatoes); // 4th topping, will not add
        hamburger.totalBurgerPrice();

        DeluxeBurger deluxeBurger = new DeluxeBurger("Steak", Bread.White);
        deluxeBurger.printPlainBurgerPrice();
        deluxeBurger.addToppings(Toppings.Bacon);
        deluxeBurger.addToppings(Toppings.Egg);
        deluxeBurger.addToppings(Toppings.Guacamole);
        deluxeBurger.addToppings(Toppings.Lettuce);
        deluxeBurger.addToppings(Toppings.Ketchup);
        deluxeBurger.addToppings(Toppings.Mustard);
        deluxeBurger.addToppings(Toppings.Mayonnaise); // 7th topping, will not add
        deluxeBurger.totalBurgerPrice();

        HealthBurger healthy = new HealthBurger("Chicken");
        healthy.printPlainBurgerPrice();
        healthy.addToppings(Toppings.Lettuce);
        healthy.addToppings(Toppings.Carrots);
        healthy.addToppings(Toppings.Guacamole);
        healthy.addToppings(Toppings.Relish);
        healthy.addToppings(Toppings.Cheese); // 5th topping, will not add
        healthy.totalBurgerPrice();

        Meal myMeal = new Meal();
        myMeal.changeBurger(Burger.Health);
        myMeal.printPlainMealPrice();

        Meal secondMeal = new Meal(Burger.Health, Side.ApplePie, Drink.MountainDew);
        secondMeal.changeDrink(Drink.Gatorade);
        secondMeal.printPlainMealPrice();

        Meal thirdMeal = new Meal(Burger.Deluxe, Side.IceCream, Drink.DrPepper);
        thirdMeal.addSide(Side.Chips);
        thirdMeal.printPlainMealPrice();
    }
}
