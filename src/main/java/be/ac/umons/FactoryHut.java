package be.ac.umons;

public class FactoryHut extends AbstractFactory {
    private static FactoryHut instance = null;
    public static FactoryHut getFactory() {
        if (instance == null) {
            instance = new FactoryHut();
        }
        return instance;
    }
    static int stock [] = {2,2,2,2};
    public Pizza createPizza(String name){
        if (name == "Prosciutto" && stock[0] > 0 ) {
            stock[0] = stock [0] - 1;
            return new ProsciuttoHut();
        }
        else if (name == "FruttiDiMare"&& stock[1] > 0 ) {
            stock[1] = stock [1] - 1;
            return new FruttiDiMareHut();
        }
        else if (name == "Carbonara"&& stock[2] > 0 ){
            stock[2] = stock [2] - 1;
            return new CarbonaraHut();
        }
        else if (name == "Margheritta"&& stock[3] > 0 ){
            stock[3] = stock [3] - 1;
            return new MargheritaHut();
        }
        else {
            return null;
        }
    };
}