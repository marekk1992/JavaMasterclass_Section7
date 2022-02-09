package exercises.burgers;

public class Hamburger {

    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;
    private Additive firstAdditive;
    private Additive secondAdditive;
    private Additive thirdAdditive;
    private Additive fourthAdditive;

    public Hamburger(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void addFirstAdditive(Additive additive) {
        firstAdditive = additive;
        System.out.println(firstAdditive.getName() + " is added to burger composition for an extra " +
                firstAdditive.getPrice() + ", total cost now is " + getTotalPrice() + ".");
    }

    public void addSecondAdditive(Additive additive) {
        secondAdditive = additive;
        System.out.println(secondAdditive.getName() + " is added to burger composition for an extra " +
                secondAdditive.getPrice() + ", total cost now is " + getTotalPrice() + ".");
    }

    public void addThirdAdditive(Additive additive) {
        thirdAdditive = additive;
        System.out.println(thirdAdditive.getName() + " is added to burger composition for an extra " +
                thirdAdditive.getPrice() + ", total cost now is " + getTotalPrice() + ".");
    }

    public void addFourthAdditive(Additive additive) {
        fourthAdditive = additive;
        System.out.println(fourthAdditive.getName() + " is added to burger composition for an extra " +
                fourthAdditive.getPrice() + ", total cost now is " + getTotalPrice() + ".");
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        double totalPrice = basePrice;
        if (firstAdditive != null) {
            totalPrice += firstAdditive.getPrice();
        }
        if (secondAdditive != null) {
            totalPrice += secondAdditive.getPrice();
        }
        if (thirdAdditive != null) {
            totalPrice += thirdAdditive.getPrice();
        }
        if (fourthAdditive != null) {
            totalPrice += fourthAdditive.getPrice();
        }

        return totalPrice;
    }
}
