package burger_shop;

import java.text.DecimalFormat;
import java.util.Arrays;

public class HealthBurger extends Burger {
    private String healthyTopping1Name;
    private double healthyTopping1Price;

    private String healthyTopping2Name;
    private double healthyTopping2Price;

    private String healthyTopping3Name;
    private double healthyTopping3Price;

    private String healthyTopping4Name;
    private double healthyTopping4Price;

    private static DecimalFormat priceFormat = new DecimalFormat("##0.00");

    private String[] healthyToppings = {"Lettuce", "Tomatoes", "Carrots", "Guacamole", "Pickles"};

    public HealthBurger(String meat) {
        super("Healthy", meat, "Brown Rye");
        double price = 4.25;
    }

    public void addHealthyTopping1(String name, double price) {
        this.healthyTopping1Name = name;
        this.healthyTopping1Price = price;
    }

    public void addHealthyTopping2(String name, double price) {
        this.healthyTopping2Name = name;
        this.healthyTopping2Price = price;
    }

    public void addHealthyTopping3(String name, double price) {
        this.healthyTopping3Name = name;
        this.healthyTopping3Price = price;
    }

    public void addHealthyTopping4(String name, double price) {
        this.healthyTopping4Name = name;
        this.healthyTopping4Price = price;
    }

    public boolean topping1IsHealthy() {
        if(Arrays.asList(healthyToppings).contains(healthyTopping1Name)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean topping2IsHealthy() {
        if(Arrays.asList(healthyToppings).contains(healthyTopping2Name)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean topping3IsHealthy() {
        if(Arrays.asList(healthyToppings).contains(healthyTopping3Name)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean topping4IsHealthy() {
        if(Arrays.asList(healthyToppings).contains(healthyTopping4Name)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addBurgerTopping1(String name, double price) {
        throw new UnsupportedOperationException("Unhealthy topping cannot be added to the Health Burger");
    }

    @Override
    public void addBurgerTopping2(String name, double price) {
        throw new UnsupportedOperationException("Unhealthy topping cannot be added to the Health Burger");
    }

    @Override
    public double totalBurgerPrice() {
        double burgerPrice = this.plainBurgerPrice();
        if(this.healthyTopping1Name != null && this.topping1IsHealthy()) {
            burgerPrice += this.healthyTopping1Price;
            System.out.println("Added " + this.healthyTopping1Name + " for an extra $" + priceFormat.format(this.healthyTopping1Price));
        } else if(!this.topping1IsHealthy()) {
            System.out.println(this.healthyTopping1Name + " is not available on the Health Burger");
        }
        if(this.healthyTopping2Name != null && this.topping2IsHealthy()) {
            burgerPrice += this.healthyTopping2Price;
            System.out.println("Added " + this.healthyTopping2Name + " for an extra $" + priceFormat.format(this.healthyTopping2Price));
        } else if(!this.topping2IsHealthy()) {
            System.out.println(this.healthyTopping2Name + " is not available on the Health Burger");
        }
        if(this.healthyTopping3Name != null && this.topping3IsHealthy()) {
            burgerPrice += this.healthyTopping3Price;
            System.out.println("Added " + this.healthyTopping3Name + " for an extra $" + priceFormat.format(this.healthyTopping3Price));
        } else if(!this.topping3IsHealthy()) {
            System.out.println(this.healthyTopping3Name + " is not available on the Health Burger");
        }
        if(this.healthyTopping4Name != null && this.topping4IsHealthy()) {
            burgerPrice += this.healthyTopping4Price;
            System.out.println("Added " + this.healthyTopping4Name + " for an extra $" + priceFormat.format(this.healthyTopping4Price));
        } else if(!this.topping4IsHealthy()) {
            System.out.println(this.healthyTopping4Name + " is not available on the Health Burger");
        }
        return burgerPrice;
    }
}