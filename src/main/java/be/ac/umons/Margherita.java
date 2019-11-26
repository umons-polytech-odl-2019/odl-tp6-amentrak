package be.ac.umons;

import be.ac.umons.util.Pizza;

public class Margherita extends Pizza {
    Margherita(  ) {
        super("Margherita");

        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());

    }
}
