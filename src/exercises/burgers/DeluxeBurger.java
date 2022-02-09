package exercises.burgers;

public class DeluxeBurger extends Hamburger {

    private String firstAdditive;
    private String secondAdditive;

    public DeluxeBurger(String name, String breadRollType, String meat, double basePrice) {
        super(name, breadRollType, meat, basePrice);
        this.firstAdditive = "Chips";
        this.secondAdditive = "Drink";
    }

    @Override
    public void addFirstAdditive(String additive, double additivePrice) {
        System.out.println("Can`t add more additives to deluxe burger composition");
    }

    @Override
    public void addSecondAdditive(String additive, double additivePrice) {
        System.out.println("Can`t add more additives to deluxe burger composition");
    }

    @Override
    public void addThirdAdditive(String additive, double additivePrice) {
        System.out.println("Can`t add more additives to deluxe burger composition");
    }

    @Override
    public void addFourthAdditive(String additive, double additivePrice) {
        System.out.println("Can`t add more additives to deluxe burger composition");
    }

    @Override
    public String getFirstAdditive() {
        return firstAdditive;
    }

    @Override
    public String getSecondAdditive() {
        return secondAdditive;
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public double getPriceOfAllAdditives() {
        return super.getPriceOfAllAdditives();
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }
}
