package factorypattern;

public class Items {

    private String Name;

    private String price;

    private String type;

    public Items(String name, String price, String type) {
        Name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Items{" +
                "Name='" + Name + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
