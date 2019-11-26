package be.ac.umons;

import java.math.BigDecimal;

public class Pan extends DecoratorPizza {
    public Pan(){

    }

    public Pizza DecoratePizza(Pizza p) {
        return null;
    }

    public String getName(){
        return ("Pan" + super.getName());
    };

    public BigDecimal getPrice(){
        p.getPrice();
        return super.getPrice().add(new BigDecimal(1.50)) ;
    };

    public void setName (String n ){};

    public void setPrice(BigDecimal p){};
}
