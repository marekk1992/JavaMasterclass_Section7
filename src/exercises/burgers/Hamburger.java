package exercises.burgers;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;
    private double priceOfAdditives;

    public Hamburger(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addCarrot() {
        priceOfAdditives += 0.20;
        System.out.println("Added carrot to hamburger.");
    }

    public void addTomato() {
        priceOfAdditives += 0.40;
        System.out.println("Added tomato to hamburger.");
    }

    public void addCucumber() {
        priceOfAdditives += 0.30;
        System.out.println("Added cucumber to hamburger.");
    }

    public void addMustard() {
        priceOfAdditives += 0.20;
        System.out.println("Added mustard to hamburger.");
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getFinalPrice() {
        return basePrice + priceOfAdditives;
    }
}
