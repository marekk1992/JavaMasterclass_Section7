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
    public void addAdditive1(String additive, double additivePrice) {
       System.out.println("Can`t add more additives to deluxe burger composition");
    }

    @Override
    public void addAdditive2(String additive, double additivePrice) {
        System.out.println("Can`t add more additives to deluxe burger composition");
    }

    @Override
    public void addAdditive3(String additive, double additivePrice) {
        System.out.println("Can`t add more additives to deluxe burger composition");
    }

    @Override
    public void addAdditive4(String additive, double additivePrice) {
        System.out.println("Can`t add more additives to deluxe burger composition");
    }

    @Override
    public double getFinalPrice() {
        return getBasePrice();
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }
}
