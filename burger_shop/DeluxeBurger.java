package burger_shop;

public class DeluxeBurger extends Burger {
    private String topping3Name;
    private double topping3Price;

    private String topping4Name;
    private double topping4Price;

    private String topping5Name;
    private double topping5Price;

    private String topping6Name;
    private double topping6Price;

    public DeluxeBurger(String breadRollType) {
        super("Deluxe", "Sausage & Bacon", breadRollType);
        double price = 4.50;
    }

    public void addBurgerTopping3(String name, double price) {
        this.topping3Name = name;
        this.topping3Price = price;
    }

    public void addBurgerTopping4(String name, double price) {
        this.topping4Name = name;
        this.topping4Price = price;
    }

    public void addBurgerTopping5(String name, double price) {
        this.topping5Name = name;
        this.topping5Price = price;
    }

    public void addBurgerTopping6(String name, double price) {
        this.topping6Name = name;
        this.topping6Price = price;
    }
}
