package burger_shop;

public class HealthBurger extends Burger {
    private String healthyTopping1Name;
    private double healthyTopping1Price;

    private String healthyTopping2Name;
    private double healthyTopping2Price;

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

    @Override
    public double totalBurgerPrice() {
        double hamburgerPrice = super.totalBurgerPrice();
        if(this.healthyTopping1Name != null) {
            hamburgerPrice += this.healthyTopping1Price;
            System.out.println("Added " + this.healthyTopping1Name + " for an extra " + this.healthyTopping1Price);
        }
        if(this.healthyTopping2Name != null) {
            hamburgerPrice += this.healthyTopping2Price;
            System.out.println("Added " + this.healthyTopping2Name + " for an extra " + this.healthyTopping2Price);
        }
        return hamburgerPrice;
    }
}

// need to add 2 more healthy toppings, and somehow only allow users to pick from a certain set of toppings