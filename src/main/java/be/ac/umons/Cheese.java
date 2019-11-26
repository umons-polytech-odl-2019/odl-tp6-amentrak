package be.ac.umons;

public class Cheese extends Ingredient{
        Cheese(){
                super (App.ingredients.get("Chesse").getName(),App.ingredients.get("Chesse").getPrice());
                // le premier point get va chercher la clé et prendre le nom dans la map et après le meme pour le prix
}
}
