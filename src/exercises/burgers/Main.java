package exercises.burgers;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Classic", "Ciabatta", "beef", 4.50);
        hamburger.addFirstAdditive("Carrot", 0.50);
        hamburger.addSecondAdditive("Cucumber", 0.30);
        System.out.println(hamburger.getTotalPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Vegetarian", "No meat", 5.50);
        healthyBurger.addFirstAdditive("Tomato", 0.40);
        System.out.println(healthyBurger.getTotalPrice());

        DeluxeBurger deluxe = new DeluxeBurger("King Burger", "Ciabatta", "Chicken",
                10);
        deluxe.addFirstAdditive("Tomato", 0.50);
        System.out.println(deluxe.getFirstAdditive());
        System.out.println(deluxe.getBasePrice());
        System.out.println(deluxe.getTotalPrice());
    }
}
