package exercises.burgers;

public class HealthyBurger extends Hamburger {

    private String fifthAdditive;
    private String sixthAdditive;
    private double fifthAdditivePrice;
    private double sixthAdditivePrice;

    public HealthyBurger(String name, String meat, double basePrice) {
        super(name, "brown rye bread", meat, basePrice);
    }

    @Override
    public void addFirstAdditive(String additive, double additivePrice) {
        super.addFirstAdditive(additive, additivePrice);
    }

    @Override
    public void addSecondAdditive(String additive, double additivePrice) {
        super.addSecondAdditive(additive, additivePrice);
    }

    @Override
    public void addThirdAdditive(String additive, double additivePrice) {
        super.addThirdAdditive(additive, additivePrice);
    }

    @Override
    public void addFourthAdditive(String additive, double additivePrice) {
        super.addFourthAdditive(additive, additivePrice);
    }

    public void addFifthAdditive(String additive, double additivePrice) {
        fifthAdditive = additive;
        fifthAdditivePrice = additivePrice;
        System.out.println(fifthAdditive + " is added to burger composition, total cost now is "
                + getTotalPrice());
    }

    public void addSixthAdditive(String additive, double additivePrice) {
        sixthAdditive = additive;
        sixthAdditivePrice = additivePrice;
        System.out.println(sixthAdditive + " is added to burger composition, total cost now is "
                + getTotalPrice());
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

    public String getFifthAdditive() {
        return fifthAdditive;
    }

    public String getSixthAdditive() {
        return sixthAdditive;
    }

    public double getFifthAdditivePrice() {
        return fifthAdditivePrice;
    }

    public double getSixthAdditivePrice() {
        return sixthAdditivePrice;
    }
}
