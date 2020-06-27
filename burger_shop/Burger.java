package burger_shop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Burger {

    public static final Burger Plain = new Burger("beef", Bread.White);
    public static final Burger Deluxe = new DeluxeBurger("Steak", Bread.Wheat);
    public static final Burger Health = new HealthBurger("Chicken");

    private String name;
    private String meat;
    private double price;
    private Bread breadRollType;
    private ArrayList<Toppings> toppingsList;
    private int maxToppings;

    private static DecimalFormat priceFormat = new DecimalFormat("##0.00");

    public Burger(String meat, Bread breadRollType) {
        this.name = "Plain";
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = 3.25;
        this.toppingsList = new ArrayList<>();
        this.maxToppings = 2;
    }

    public String getBurgerName() {
        return name;
    }

    public void setBurgerName(String name) {
        this.name = name;
    }

    public void setBurgerPrice(double price) {
        this.price = price;
    }

    public void setMaxToppings(int maxToppings) {
        this.maxToppings = maxToppings;
    }

    public void addToppings(Toppings topping) {
        if(this.toppingsList.size() >= this.maxToppings) {
            System.out.println("Exceeded maximum toppings allowed. The " + this.name + " Burger only allows for " + this.maxToppings + " toppings.");
        } else {
            System.out.println("Added " + topping.getToppingName() + " for an extra: $" + priceFormat.format(topping.getToppingPrice()));
            this.toppingsList.add(topping);
        }
    }

    public double plainBurgerPrice(){
        return this.price;
    }

    public void printPlainBurgerPrice() {
        System.out.println(this.name + " hamburger with a " + this.meat + " patty on a " + this.breadRollType.getBreadTypeName() + " " + "bun, price is $" + priceFormat.format(this.price));
    }

    public void totalBurgerPrice() {
        double burgerPrice = this.price;
        for(int i = 0; i < toppingsList.size(); i++) {
            Toppings checkedTopping = this.toppingsList.get(i);
            burgerPrice += checkedTopping.getToppingPrice();
        }
        System.out.println("Total burger price with toppings: $" + priceFormat.format(burgerPrice) + "\n");
    }
}
