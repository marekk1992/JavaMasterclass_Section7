package exercises.burgers;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;
    private double priceOfAdditives;
    private String additive1;
    private String additive2;
    private String additive3;
    private String additive4;
    private double additive1Price;
    private double additive2Price;
    private double additive3Price;
    private double additive4Price;

    public Hamburger(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addAdditive1(String additive, double additivePrice) {
        additive1 = additive;
        additive1Price = additivePrice;
        priceOfAdditives += additivePrice;
        System.out.println(getAdditive1() + " is added to burger composition, total cost now is " + getFinalPrice());
    }

    public void addAdditive2(String additive, double additivePrice) {
        additive2 = additive;
        additive2Price = additivePrice;
        priceOfAdditives += additivePrice;
        System.out.println(getAdditive2() + " is added to burger composition, total cost now is " + getFinalPrice());
    }

    public void addAdditive3(String additive, double additivePrice) {
        additive3 = additive;
        additive3Price = additivePrice;
        priceOfAdditives += additivePrice;
        System.out.println(getAdditive3() + " is added to burger composition, total cost now is " + getFinalPrice());
    }

    public void addAdditive4(String additive, double additivePrice) {
        additive4 = additive;
        additive4Price = additivePrice;
        priceOfAdditives += additivePrice;
        System.out.println(getAdditive4() + " is added to burger composition, total cost now is " + getFinalPrice());
    }

    public String getAdditive1() {
        return additive1;
    }

    public String getAdditive2() {
        return additive2;
    }

    public String getAdditive3() {
        return additive3;
    }

    public String getAdditive4() {
        return additive4;
    }

    public double getAdditive1Price() {
        return additive1Price;
    }

    public double getAdditive2Price() {
        return additive2Price;
    }

    public double getAdditive3Price() {
        return additive3Price;
    }

    public double getAdditive4Price() {
        return additive4Price;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getFinalPrice() {
        return basePrice + priceOfAdditives;
    }
}
