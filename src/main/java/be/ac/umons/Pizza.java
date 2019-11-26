package be.ac.umons.util;

import be.ac.umons.Ingredient;

import java.util.ArrayList;

public class Pizza {
    private String name;
    private float price=0;
    private ArrayList<Ingredient>listIngredients;

    public Pizza (String name) {}

    public String getName() {
        return name;
    }

    float getPrice(){
        return price;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setPrice(float p) {
        this.price = p;
    }

    public ArrayList<Ingredient> getListIngredient(){
        return listIngredients;
    }

    public void addIngredient(Ingredient i){
        listIngredients.add(i);
    }

    public String toString(){
        return super.toString();
    }
}