package builder;

import java.util.EnumSet;
import java.util.Set;

public class Pizza {
    private final String size;
    private final Set<Ingredient> ingredients;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.ingredients = builder.ingredients;
    }

    public static class Builder {
        private final String size;
        private final Set<Ingredient> ingredients = EnumSet.noneOf(Ingredient.class);

        public Builder(String size) {
            this.size = size;
        }

        public Builder addIngredient(Ingredient ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Builder addIngredients(Ingredient... ingredients) {
            for (Ingredient i : ingredients) {
                this.ingredients.add(i);
            }
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", ingredients=" + ingredients + "]";
    }
}
