import java.util.Scanner;

public class InputStringAsNumber {

    public static void main(String[] args) {
//        System.out.println("enter number");
        System.out.println();
//        System.out.println();
//        System.out.println(password("123"));
        System.out.println("Password....");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(!s.matches("[0-9]+")){
            throw new IllegalStateException("Password must be contain number");
        }else{
            System.out.println(s);
        }
        System.out.println(checkPassword(s));

    }

    public static String password(String password){
        String number = "";
        number = password;
        if (!number.matches("[0-9]+")) {
            System.out.println("Invalid number");
        }else {
            System.out.println("good");
        }
        return number;
    }

    public static boolean checkPassword(String password){
        if(password.matches("[0-9]]")){
            return false;
        }
        return true;
    }

}


//(!number.matches("[0-9]+"))