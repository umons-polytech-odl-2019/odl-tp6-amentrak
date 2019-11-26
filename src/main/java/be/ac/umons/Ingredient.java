package be.ac.umons;

import java.math.BigDecimal;

public class Ingredient {
    private String name;
    private BigDecimal price;

    public Ingredient(String name, BigDecimal price) {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}