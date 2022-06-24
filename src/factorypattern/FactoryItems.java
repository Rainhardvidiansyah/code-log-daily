package factorypattern;

public class FactoryItems {

    private static String def = "This is default value";

    public Items decideItems(String name, String price, String type){
        switch (type){
            case "private":
                return new PrivateItems(name, price, type);
            case "rental":
                return new RentalItems(name, price, type);
            default:
                return null;
        }
    }
}
