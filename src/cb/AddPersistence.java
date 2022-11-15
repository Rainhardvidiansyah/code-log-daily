package cb;

public class AddPersistence {

    private static int persist(int num){
        int times = 0;
        int added = num;
        while (added > 9){
            int sum = 0;
            String[] intArr = Integer.toString(added).split("");
            for (String i: intArr) {
                sum += Integer.parseInt(i);
            }
            added = sum;
            times++;
        }
        return times;
    }

    public static void main(String[] args) {
        System.out.println("Additive Persistence");

        var x = persist(199);
        System.out.println(x);

        var y = persist(913);
        System.out.println(y);
    }
}
