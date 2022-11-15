package cb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckAB {
    public static String checkAB(String string){
        Pattern pattern = Pattern.compile("(a...b|b...a)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        boolean match = matcher.find();
        if (match){
            return "benar";
        }else {
            return "salah";
        }
    }
    public static void main(String[] args) {

        String x = checkAB("lane borrowed");
        System.out.println(x);

        String y = checkAB("australia");
        System.out.println(y);

        String z = checkAB("Ala Biawak");
        System.out.println(z);

    }
}
