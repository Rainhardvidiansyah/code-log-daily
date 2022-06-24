package factorypattern;

public class RentalItems extends Items{


    public RentalItems(String name, String price, String type) {
        super(name, price, type);
        setName(name);
        setPrice(price);
        setType(type);
    }
}
