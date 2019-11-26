package be.ac.umons;

import be.ac.umons.util.Pizza;

public class FruttiDiMare extends Pizza {
    public FruttiDiMare() {
        super( "FruttiDimare");
        addIngredient(new Dough());
        addIngredient(new TomatoSauce());
        addIngredient(new Cheese());
        addIngredient(new Seafood());

    }
}
