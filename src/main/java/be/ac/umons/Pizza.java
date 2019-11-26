package be.ac.umons;


import java.math.BigDecimal;
import java.util.ArrayList;

public class Pizza implements PizzaComponent {
    private String name;
    private BigDecimal price;
    private ArrayList<Ingredient>listIngredients;

    public Pizza (String name) {}

    public String getName() {
        return name;
    }

    public BigDecimal getPrice(){
        for (Ingredient i : listIngredients){
            price.add(i.getPrice()) ;
        }
        return price;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setPrice(BigDecimal p) {
        this.price = p;
    }

    public ArrayList<Ingredient> getListIngredient(){
        return listIngredients;
    }

    public void addIngredient(Ingredient i){
        listIngredients.add(i);
    }

    public String toString(){
        return (String.valueOf(this.price)+name);
    }
}