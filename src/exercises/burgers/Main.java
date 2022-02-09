package exercises.burgers;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Classic", "Ciabatta", "beef", 4.50);
        hamburger.addAdditive1("Carrot", 0.50);
        hamburger.addAdditive2("Cucumber", 0.30);
        System.out.println(hamburger.getFinalPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Vegetarian", "No meat", 5.50);
        healthyBurger.addAdditive1("Tomato", 0.40);
        System.out.println(healthyBurger.getFinalPrice());

        DeluxeBurger deluxe = new DeluxeBurger("King burger", "Ciabatta", "Chicken", 8,
                "Medium portion", "Pepsi");
        deluxe.addAdditive1("Tomato", 0.50);
    }
}
