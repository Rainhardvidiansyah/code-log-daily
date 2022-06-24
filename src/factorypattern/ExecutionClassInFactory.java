package factorypattern;

public class ExecutionClassInFactory {

    public static void main(String[] args) {

        FactoryItems factoryItems = new FactoryItems();
        System.out.println(factoryItems.decideItems("buku", "30000", "private").toString());
        System.out.println(factoryItems.decideItems("Jet", "40000000000", "rental").toString());
        System.out.println(factoryItems.decideItems("Iyaaaa", "7549949", "rental").toString());

    }
}
