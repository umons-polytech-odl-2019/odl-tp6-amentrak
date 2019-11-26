package be.ac.umons;

import java.math.BigDecimal;

public abstract class DecoratorPizza implements PizzaComponent {
    protected Pizza p;
    public abstract Pizza DecoratePizza( Pizza p);
    @Override
    public BigDecimal getPrice (){
        return p.getPrice();
    }
    @Override
    public String getName (){
        return p.getName();
    }
}
