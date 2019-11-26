package be.ac.umons;

import be.ac.umons.util.Pizza;

public class Carbonara extends Pizza {
    Carbonara() {
        super("Carbonara");
        addIngredient(new Dough());
        addIngredient(new WhiteCream());
        addIngredient(new Cheese());
        addIngredient(new Seafood());
    }
}
