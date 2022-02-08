package exercises.burgers;

public class HealthyBurger extends Hamburger {

    private String additive1 = "Cucumber";
    private double priceOfAdditive1 = 0.20;
    private String additive2 = "Tomato";
    private double priceOfAdditive2 = 0.40;
    private String additive3 = "Salad";
    private double priceOfAdditive3 = 0.30;
    private String additive4 = "Pepper";
    private double priceOfAdditive4 = 0.50;
    private String additive5 = "Cabbage";
    private double priceOfAdditive5 = 0.45;
    private String additive6 = "Zucchini";
    private double priceOfAdditive6 = 0.35;
    private double priceOfAdditives;

    public HealthyBurger(String name, String meat, double basePrice) {
        super(name, "brown rye bread", meat, basePrice);
    }

    @Override
    public String addAdditives(int additive) {
        if (additive < 1 || additive > 6) {
            return "Please choose additives from 1 to 6";
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
                case 5:
                    priceOfAdditives += priceOfAdditive5;
                    return "Additive5 added to composition, total price now is " + getFinalPrice();
                case 6:
                    priceOfAdditives += priceOfAdditive6;
                    return "Additive6 added to composition, total price now is " + getFinalPrice();
                default:
                    return "No additives added to composition, total price remains " + getFinalPrice();
            }
        }
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public double getFinalPrice() {
        return priceOfAdditives + getBasePrice();
    }
}
