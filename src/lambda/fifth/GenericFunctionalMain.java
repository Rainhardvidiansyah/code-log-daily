package lambda.fifth;

import java.util.Scanner;

public class GenericFunctionalMain {


    public static void main(String[] args) {
        GenericFunctionalInterface<Integer> genericFunctionalInterface = num -> {
            return num % 2;
        };
        System.out.println(genericFunctionalInterface.fun(21));
        System.out.println();

        System.out.println("Write your name...");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        GenericFunctionalInterface<String> printName = (name) -> {
            String result = "";
            for (int i = name.length() -1 ; i >= 0; i--) {
                result = result + name.charAt(i);
            }
            return result;
        };

        System.out.println(printName.fun(string));

    }
}
