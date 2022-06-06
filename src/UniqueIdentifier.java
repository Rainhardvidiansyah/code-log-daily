import java.text.SimpleDateFormat;
import java.util.*;

public class UniqueIdentifier {

    static Scanner s = new Scanner(System.in);

    private static void testing(){
        System.out.println("==========");
        List<String> list = new ArrayList<>();
        String inputStrings = "";
        for (int i = 1; i <= 5 ; i++) {
            inputStrings = s.nextLine();
            list.add(inputStrings);
            System.out.println(list.toString());
        }
        System.out.println("==========");
    }

    private static int scanner(){
        int a = 0;
            System.out.println("Input a number");
            try {
                a = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error is happening due to mismatch in type you just inputted");
            }
        return a;
    }

    public static void currentTimeOrder(){
        Date dNow = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd-hh:mm");
        String datetime = simpleDateFormat.format(dNow);
        System.out.println("Order id: " + scanner() + " -- " + datetime);
    }

    public static void main(String[] args) {
        currentTimeOrder();
        //testing();










    }
}
