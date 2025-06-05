package builder;

public class Main {
    public static void main(String[] args) {
        Pizza margherita = PizzaDirector.margherita("Small");
        Pizza meatLovers = PizzaDirector.meatLovers("Large");
        Pizza veggie = PizzaDirector.veggieDelight("Medium");

        System.out.println(margherita);
        System.out.println(meatLovers);
        System.out.println(veggie);
    }
}
