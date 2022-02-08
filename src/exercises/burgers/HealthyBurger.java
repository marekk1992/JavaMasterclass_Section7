package exercises.burgers;

public class HealthyBurger extends Hamburger {

    private double priceOfAdditives;

    public HealthyBurger(String name, String meat, double basePrice) {
        super(name, "brown rye bread", meat, basePrice);
    }

    @Override
    public void addCarrot() {
        super.addCarrot();
    }

    @Override
    public void addTomato() {
        super.addTomato();
    }

    @Override
    public void addCucumber() {
        super.addCucumber();
    }

    @Override
    public void addMustard() {
        super.addMustard();
    }

    public void addSalad() {
        priceOfAdditives += 0.35;
        System.out.println("Added salad to hamburger.");
    }

    public void addZucchini() {
        priceOfAdditives += 0.45;
        System.out.println("Added zucchini to hamburger.");
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
