package exercises.burgers;

public class HealthyBurger extends Hamburger {

    private String additive1;
    private String additive2;
    private String additive3;
    private String additive4;
    private String additive5;
    private String additive6;
    private double additive1Price;
    private double additive2Price;
    private double additive3Price;
    private double additive4Price;
    private double additive5Price;
    private double additive6Price;
    private double priceOfAdditives;

    public HealthyBurger(String name, String meat, double basePrice) {
        super(name, "brown rye bread", meat, basePrice);
    }

    @Override
    public void addAdditive1(String additive, double additivePrice) {
        super.addAdditive1(additive, additivePrice);
    }

    @Override
    public void addAdditive2(String additive, double additivePrice) {
        super.addAdditive2(additive, additivePrice);
    }

    @Override
    public void addAdditive3(String additive, double additivePrice) {
        super.addAdditive3(additive, additivePrice);
    }

    @Override
    public void addAdditive4(String additive, double additivePrice) {
        super.addAdditive4(additive, additivePrice);
    }

    public void addAdditive5(String additive, double additivePrice) {
        additive5 = additive;
        additive5Price = additivePrice;
        priceOfAdditives += additivePrice;
        System.out.println(getAdditive5() + " is added to burger composition, total cost now is " + getFinalPrice());
    }

    public void addAdditive6(String additive, double additivePrice) {
        additive6 = additive;
        additive6Price = additivePrice;
        priceOfAdditives += additivePrice;
        System.out.println(getAdditive6() + " is added to burger composition, total cost now is " + getFinalPrice());
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public double getFinalPrice() {
        return priceOfAdditives + getBasePrice();
    }

    public String getAdditive5() {
        return additive5;
    }

    public String getAdditive6() {
        return additive6;
    }

    public double getAdditive5Price() {
        return additive5Price;
    }

    public double getAdditive6Price() {
        return additive6Price;
    }
}
