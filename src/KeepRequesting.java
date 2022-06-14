import java.util.InputMismatchException;
import java.util.Scanner;

public class KeepRequesting {

    static void trueChoice(){
        System.out.println("true");
    }

    static void wrongChoice(){
        System.out.println("wrong");
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        int x = 5;
//        while (x == 5){
//
//            try{
//                System.out.println("=====");
//                int a = s.nextInt();
//                if(a == 0){
//                    System.out.println("Wrong choice");
//                    break;
//                }
//                if(a == x){
//                    System.out.println("FINISH");
//                    break;
//                }
//                System.out.println(a);
//            }catch (InputMismatchException e){
//                System.out.println(e.getMessage());
//            }
//        }

        /*
         String str = "abc";
        String a;
        System.out.println("Input");
        do {
            a = s.nextLine();
            if(a.equals(str)) System.out.println(true);
            else System.out.println("Try again");
        } while (!a.equals(str));
         */


        System.out.println("Write a Number");
        int x = 10;
        int y = 0;

        do{
            try{
                int x1 = s.nextInt();
                if(x1 == x){
                    trueChoice();
                    break;
                }
                else wrongChoice();
            }catch (InputMismatchException e){
                System.out.println("Message: " + e.getMessage());
            }
        }while (y != x);


    }
}
