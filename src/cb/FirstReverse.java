package cb;

import java.util.Scanner;

public class FirstReverse {

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverse2(String str){
        return new StringBuilder(str).append("Data").toString();
    }

    public static void main(String[] args) {
        System.out.println("First reverse");
        System.out.println();

        System.out.println("Write your Name: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        StringBuilder sb = new StringBuilder("MR. ").append(name);
        System.out.println(sb);

        StringBuilder sbs = new StringBuilder(new StringBuilder(name).reverse().toString().toUpperCase());
        System.out.println(sbs);
        var x = reverse("bala bala");
        System.out.println(x);

        var y = reverse("good looking blues");
        System.out.println(y);

        var z = reverse2("new ");
        System.out.println(z);
    }
}
