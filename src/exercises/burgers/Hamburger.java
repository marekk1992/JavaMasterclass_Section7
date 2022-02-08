package exercises.burgers;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;
    private double priceOfAdditives;
    private String additive1 = "Cucumber";
    private double priceOfAdditive1 = 0.20;
    private String additive2 = "Tomato";
    private double priceOfAdditive2 = 0.40;
    private String additive3 = "Salad";
    private double priceOfAdditive3 = 0.30;
    private String additive4 = "Pepper";
    private double priceOfAdditive4 = 0.50;

    public Hamburger(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public String addAdditives(int additive) {
        if (additive < 1 || additive > 4) {
            return "Please choose additives from 1 to 4";
        } else {
            switch (additive) {
                case 1:
                    priceOfAdditives += priceOfAdditive1;
                    return "Additive1 added to composition, total price now is " + getFinalPrice();
                case 2:
                    priceOfAdditives += priceOfAdditive2;
                    return "Additive2 added to composition, total price now is " + getFinalPrice();
                case 3:
                    priceOfAdditives += priceOfAdditive3;
                    return "Additive3 added to composition, total price now is " + getFinalPrice();
                case 4:
                    priceOfAdditives += priceOfAdditive4;
                    return "Additive4 added to composition, total price now is " + getFinalPrice();
                default:
                    return "No additives added to composition, total price remains " + getFinalPrice();
            }
        }
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getFinalPrice() {
        return basePrice + priceOfAdditives;
    }
}
