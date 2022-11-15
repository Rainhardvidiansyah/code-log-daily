package cb;


import java.util.Arrays;

public class ExOh {

    public static String exOh(String str){
        int balance = 0;
        String[] letters = str.toLowerCase().split("");
        for(String i : letters){
            switch (i){
                case "x":
                    balance ++;
                    break;
                case "o":
                    balance--;
                    break;
                default:
                    break;
            }
        }
//        return balance == 0 || str.length() == 0 ? "true" : "false";

        if(balance == 00 || str.length() == 0){
            return "Betul";
        }else{
            return "salah";
        }
    }

    public static void main(String[] args) {
        System.out.println("EXOH class");
        System.out.println();

        var y = exOh("xxxooo");
        System.out.println(y);
        var x = exOh("xxxoo");
        System.out.println(x);

        var z = exOh("z");
        System.out.println(z);

        System.out.println("Start of Splitting");
        String s = "rainhard@gmail.com";
        String[] splitting = s.split("r", 2);
        System.out.println("Result of Splitting ::> "+ Arrays.toString(splitting));
        for (String a : splitting){
            System.out.println(a);
        }



    }
}
