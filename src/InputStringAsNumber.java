public class InputStringAsNumber {

    public static void main(String[] args) {
        System.out.println("enter number");
        System.out.println();
        System.out.println();
        System.out.println(password("123"));

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
}


//(!number.matches("[0-9]+"))