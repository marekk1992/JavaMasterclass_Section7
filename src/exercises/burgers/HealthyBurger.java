package exercises.burgers;

public class HealthyBurger extends Hamburger {

    private Additive firstExtraAdditive;
    private Additive secondExtraAdditive;

    public HealthyBurger(String meat, double basePrice) {
        super("Healthy", "Brown rye", meat, basePrice);
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

    public void addFirstExtraAdditive(Additive additive) {
        firstExtraAdditive = additive;
        System.out.println(firstExtraAdditive.getName() + " is added to burger composition for an extra " +
                firstExtraAdditive.getPrice() + ", total cost now is " + getTotalPrice() + ".");
    }

    public void addSecondExtraAdditive(Additive additive) {
        secondExtraAdditive = additive;
        System.out.println(secondExtraAdditive.getName() + " is added to burger composition for an extra " +
                secondExtraAdditive.getPrice() + ", total cost now is " + getTotalPrice() + ".");
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = super.getTotalPrice();
        if (firstExtraAdditive != null) {
            totalPrice += firstExtraAdditive.getPrice();
        }
        if (secondExtraAdditive != null) {
            totalPrice += secondExtraAdditive.getPrice();
        }

        return totalPrice;
    }
}
