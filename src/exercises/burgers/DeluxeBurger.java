package exercises.burgers;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String breadRollType, String meat) {
        super("Deluxe", breadRollType, meat, 13);
        Additive firstAdditive = new Additive("Chips", 2.50);
        super.addFirstAdditive(firstAdditive);
        Additive secondAdditive = new Additive("Drink", 4.50);
        super.addSecondAdditive(secondAdditive);
    }

    @Override
    public void addFirstAdditive(Additive additive) {
        System.out.println("Can`t add more additives to Deluxe burger composition.");
    }

    @Override
    public void addSecondAdditive(Additive additive) {
        System.out.println("Can`t add more additives to Deluxe burger composition.");
    }

    @Override
    public void addThirdAdditive(Additive additive) {
        System.out.println("Can`t add more additives to Deluxe burger composition.");
    }

    @Override
    public void addFourthAdditive(Additive additive) {
        System.out.println("Can`t add more additives to Deluxe burger composition.");
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }
}
