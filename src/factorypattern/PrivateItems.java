package factorypattern;

public class PrivateItems extends Items{

    public PrivateItems(String name, String price, String type) {
        super(name, price, type);
        setName(name);
        setPrice(price);
        setType(type);
    }
}
