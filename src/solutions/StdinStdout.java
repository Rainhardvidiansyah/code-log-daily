package solutions;

import java.util.Scanner;

public class StdinStdout {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer integer = scan.nextInt();
        double dbl = scan.nextDouble();
        scan.nextLine();
        String string = scan.nextLine();
        System.out.println("int: " + integer);
        System.out.println("double: " + dbl);
        System.out.println("string: " + string);


//        System.out.println(42);
//        System.out.println(3.1415);
//        System.out.println("Welcome to HackerRank's Java tutorials!");
    }
}
