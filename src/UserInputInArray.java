import java.util.Arrays;
import java.util.Scanner;

public class UserInputInArray {

    public static void userInput(String[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+ 1 + ". " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input anything");
        String a = s.nextLine();
        System.out.println("Type again");
        String b = s.nextLine();
        userInput(new String[]{a, b});

    }

}
