package be.ac.umons;

public abstract class AbstractFactory {
    private String name;
    public abstract String getFactory(String name);
    public abstract String createPizza(String name);


}
