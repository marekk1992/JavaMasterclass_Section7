package exercises.burgers;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "White", "Beef", 5.50);
        Additive firstAdditive = new Additive("Pepper", 0.52);
        hamburger.addFirstAdditive(firstAdditive);
        Additive secondAdditive = new Additive("Tomato", 0.61);
        hamburger.addSecondAdditive(secondAdditive);

        HealthyBurger healthy = new HealthyBurger("Sausage", 7.50);
        healthy.addFirstAdditive(firstAdditive);
        healthy.addFirstExtraAdditive(secondAdditive);

        DeluxeBurger deluxe = new DeluxeBurger("White", "Chicken");
        System.out.println(deluxe.getTotalPrice());
    }
}
