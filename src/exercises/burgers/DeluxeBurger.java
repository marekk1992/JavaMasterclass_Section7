package exercises.burgers;

public class DeluxeBurger extends Hamburger {

    private String chips;
    private String drink;

    public DeluxeBurger(String name, String breadRollType, String meat, double basePrice, String chips, String drink) {
        super(name, breadRollType, meat, basePrice);
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public void addCarrot() {
        System.out.println("Can`t add additional additives to burger composition");
    }

    @Override
    public void addTomato() {
        System.out.println("Can`t add additional additives to burger composition");
    }

    @Override
    public void addCucumber() {
        System.out.println("Can`t add additional additives to burger composition");
    }

    @Override
    public void addMustard() {
        System.out.println("Can`t add additional additives to burger composition");
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public double getFinalPrice() {
        return getBasePrice();
    }
}
