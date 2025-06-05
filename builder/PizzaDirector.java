package builder;

public class PizzaDirector {
    public static Pizza margherita(String size) {
        return new Pizza.Builder(size)
                .addIngredient(Ingredient.CHEESE)
                .addIngredient(Ingredient.OLIVES)
                .build();
    }

    public static Pizza meatLovers(String size) {
        return new Pizza.Builder(size)
                .addIngredients(Ingredient.CHEESE, Ingredient.BACON, Ingredient.SAUSAGE, Ingredient.PEPPERONI)
                .build();
    }

    public static Pizza veggieDelight(String size) {
        return new Pizza.Builder(size)
                .addIngredients(Ingredient.CHEESE, Ingredient.MUSHROOMS, Ingredient.ONIONS, Ingredient.OLIVES)
                .build();
    }
}
