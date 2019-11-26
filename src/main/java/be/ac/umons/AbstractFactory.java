package be.ac.umons;

public abstract class AbstractFactory {
    String name;
    public static AbstractFactory getFactory(String name){
        if (name == "Dominos"){
            return new FactoryDominos();
        }
        else if (name == "Hut"){
            return new FactoryHut();
        }
        else {
            return null;
        }
    };
    public abstract Pizza createPizza(String name);

}
