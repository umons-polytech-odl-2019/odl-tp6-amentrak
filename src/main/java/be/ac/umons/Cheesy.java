package be.ac.umons;

import java.math.BigDecimal;

public class Cheesy extends DecoratorPizza {
    public Cheesy(){
        new BigDecimal(0.0);
    }
    public Pizza DecoratePizza(Pizza p) {
        return null;
    }
    public String getName(){
        return ("Cheesy" + super.getName());
    };
    public BigDecimal getPrice(){
        p.getPrice();
        return super.getPrice().add(new BigDecimal(2.0)) ;
    };

    public void setName (String n ){};

    public void setPrice(BigDecimal p){};
}
