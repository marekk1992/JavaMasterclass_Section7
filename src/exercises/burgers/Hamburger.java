package exercises.burgers;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;
    private String firstAdditive;
    private String secondAdditive;
    private String thirdAdditive;
    private String fourthAdditive;
    private double firstAdditivePrice;
    private double secondAdditivePrice;
    private double thirdAdditivePrice;
    private double fourthAdditivePrice;

    public Hamburger(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addFirstAdditive(String additive, double additivePrice) {
        firstAdditive = additive;
        firstAdditivePrice = additivePrice;
        System.out.println(firstAdditive + " is added to burger composition for an extra " +
                firstAdditivePrice + ", total cost now is " + getTotalPrice() + ".");
    }

    public void addSecondAdditive(String additive, double additivePrice) {
        secondAdditive = additive;
        secondAdditivePrice = additivePrice;
        System.out.println(secondAdditive + " is added to burger composition for an extra " +
                secondAdditivePrice + ", total cost now is " + getTotalPrice() + ".");
    }

    public void addThirdAdditive(String additive, double additivePrice) {
        thirdAdditive = additive;
        thirdAdditivePrice = additivePrice;
        System.out.println(thirdAdditive + " is added to burger composition for an extra " +
                thirdAdditivePrice + ", total cost now is " + getTotalPrice() + ".");
    }

    public void addFourthAdditive(String additive, double additivePrice) {
        fourthAdditive = additive;
        fourthAdditivePrice = additivePrice;
        System.out.println(fourthAdditive + " is added to burger composition for an extra " +
                fourthAdditivePrice + ", total cost now is " + getTotalPrice() + ".");
    }

    public String getFirstAdditive() {
        return firstAdditive;
    }

    public String getSecondAdditive() {
        return secondAdditive;
    }

    public String getThirdAdditive() {
        return thirdAdditive;
    }

    public String getFourthAdditive() {
        return fourthAdditive;
    }

    public double getFirstAdditivePrice() {
        return firstAdditivePrice;
    }

    public double getSecondAdditivePrice() {
        return secondAdditivePrice;
    }

    public double getThirdAdditivePrice() {
        return thirdAdditivePrice;
    }

    public double getFourthAdditivePrice() {
        return fourthAdditivePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getPriceOfAllAdditives() {
        return firstAdditivePrice + secondAdditivePrice + thirdAdditivePrice + fourthAdditivePrice;
    }

    public double getTotalPrice() {
        return basePrice + getPriceOfAllAdditives();
    }
}
