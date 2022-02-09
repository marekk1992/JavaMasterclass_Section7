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
        super.addFirstAdditive(additive);
    }

    @Override
    public void addSecondAdditive(Additive additive) {
        super.addSecondAdditive(additive);
    }

    @Override
    public void addThirdAdditive(Additive additive) {
        super.addThirdAdditive(additive);
    }

    @Override
    public void addFourthAdditive(Additive additive) {
        super.addFourthAdditive(additive);
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
