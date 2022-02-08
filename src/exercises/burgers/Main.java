package exercises.burgers;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Classic", "Ciabatta", "beef", 4.50);
        System.out.println(hamburger.getBasePrice());
        hamburger.addCarrot();
        hamburger.addMustard();
        System.out.println("Price with additions is " + hamburger.getFinalPrice());

        HealthyBurger healthyBurger = new HealthyBurger("Vegetarian", "No meat", 5.50);
        System.out.println(healthyBurger.getBasePrice());
        healthyBurger.addZucchini();
        System.out.println(healthyBurger.getFinalPrice());

        DeluxeBurger deluxe = new DeluxeBurger("King burger", "Ciabatta", "Chicken", 8,
                "Medium portion", "Pepsi");
        System.out.println(deluxe.getBasePrice());
        deluxe.addCarrot();
    }
}
