package be.ac.umons;

public class WhiteCream extends Ingredient {
    WhiteCream() {
        super(App.ingredients.get("WhiteCream").getName(), App.ingredients.get("WhiteCream").getPrice());
    }
}

