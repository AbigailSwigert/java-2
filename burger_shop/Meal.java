package burger_shop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class Meal {

    Burger mealBurger;
    Side mealSide;
    Drink mealDrink;
    private final ArrayList<Side> sidesList;
    private double mealPrice;

    private static final DecimalFormat priceFormat = new DecimalFormat("##0.00");

    public Meal() {
        this.mealBurger = new Burger("Beef", Bread.White);
        this.mealSide = Side.Fries;
        this.mealDrink = Drink.Water;
        this.sidesList = new ArrayList<>(Collections.singletonList(mealSide));
        this.mealPrice = this.plainMealPrice();
    }

    public Meal(Burger mealBurger, Side mealSide, Drink mealDrink) {
        this.mealBurger = mealBurger;
        this.mealSide = mealSide;
        this.sidesList = new ArrayList<>(Collections.singletonList(mealSide));
        this.mealDrink = mealDrink;
        this.mealPrice = this.plainMealPrice();

    }

    public void changeBurger(Burger newMealBurger) {
        this.mealBurger = newMealBurger;
        this.mealPrice = this.plainMealPrice();
    }

    public void changeDrink(Drink newMealDrink) {
        this.mealDrink = newMealDrink;
        this.mealPrice = this.plainMealPrice();
    }

    private String printSides() {
        ArrayList<String> sideNames = new ArrayList<>();
        for(Side s: sidesList) {
            sideNames.add(s.getSideName());
        }
        return sideNames.toString().replace("[", "").replace("]", "");
    }

    public void printPlainMealPrice() {
        this.mealBurger.printPlainBurgerPrice();
        System.out.println("Side(s): " + this.printSides());
        System.out.println("Drink: " + this.mealDrink.getDrinkName());
        System.out.println(this.mealBurger.getBurgerName() + " meal price before additional toppings or sides: $" + priceFormat.format(this.mealPrice));
    }

    public double plainMealPrice() {
        return this.mealBurger.plainBurgerPrice() + this.mealSide.getSidePrice() + this.mealDrink.getDrinkPrice();
    }

    public void addSide(Side newSide) {
        if(this.sidesList.contains(newSide)) {
            System.out.println(newSide + " has already been added to this meal, please pick a new side.");
        } else if(this.sidesList.size() >= 3) {
            System.out.println("You may only add 3 sides to a meal.");
        } else {
            sidesList.add(newSide);
        }
    }
}
