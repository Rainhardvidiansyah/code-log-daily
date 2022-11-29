import java.util.Scanner;

public class BooleanReturnTrueOrFalse {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Insert your name...");
//
//        String userName = s.nextLine();
//        boolean name = getName(userName);
//        System.out.println(name);
//
//
//        System.out.println("insert your password....");
//        String userPassword = s.nextLine();
//
//        boolean password = getPassword(userPassword);
//        System.out.println(password);


        boolean ab = "rainhard".length() > 4;

        String name;
        do{
            name = s.nextLine();
            getName(name);
            if(name.length() < 10){
                System.out.println("Salah");
            }else {
                System.out.println("Benar");
            }
        }while (name.length() < 10);
    }


    static boolean getName(String name){
        return name.length() >= 10;
    }

    static boolean getPassword(String password){
        return password.matches("[0-9]+");
    }

    static boolean checkNameLength(String name){
        return name.length() >= 10;
    }

}
