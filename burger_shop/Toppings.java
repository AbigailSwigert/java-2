package burger_shop;

public class Toppings {
    private String toppingName;
    private double toppingPrice;
    private boolean isHealthy;
    public static final Toppings Lettuce = new Toppings("lettuce", 0.27, true);
    public static final Toppings Tomatoes = new Toppings("tomatoes", 0.15, true);
    public static final Toppings Carrots = new Toppings("carrots", 0.27, true);
    public static final Toppings Pickles = new Toppings("pickles", 0.35, true);
    public static final Toppings Ketchup = new Toppings("ketchup", 0.10, true);
    public static final Toppings Mustard = new Toppings("mustard", 0.10, true);
    public static final Toppings Mayonnaise = new Toppings("mayonnaise", 0.15, false);
    public static final Toppings Relish = new Toppings("relish", 0.25, true);
    public static final Toppings Guacamole = new Toppings("guacamole", 0.55, true);
    public static final Toppings Cheese = new Toppings("cheese", 1.00, false);
    public static final Toppings Bacon = new Toppings("bacon", 1.25, false);
    public static final Toppings Egg = new Toppings("egg", 1.00, false);

    public Toppings(String toppingName, double toppingPrice, boolean isHealthy) {
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
        this.isHealthy = isHealthy;
    }

    public String getToppingName() {
        return this.toppingName;
    }

    public double getToppingPrice() {
        return this.toppingPrice;
    }

    public boolean isHealthy() {
        return this.isHealthy;
    }
}
