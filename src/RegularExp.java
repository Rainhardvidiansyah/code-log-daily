import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {



    public static void main(String[] args) {

        Pattern p = Pattern.compile("rainhard", Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher("This is Rainhard");
        Matcher matcher2 = p.matcher("This is Bla ... bla");
        boolean found = matcher.find();
        boolean found2 = matcher2.find();
        if(found2) System.out.println("Found");
        else System.out.println("No match found");
        if(found){
            System.out.println("Match Found");
        }else {
            System.out.println("Not match found");
        }

        Pattern patternCompile = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
        System.out.println(patternCompile);
        Matcher matcher1 = patternCompile.matcher("ra");
        boolean a = matcher1.find();
        System.out.println("The answer is " + a);


        double currency = 100000.00;
        System.out.println(currency);
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        System.out.println(nf.format(currency));




    }

}
