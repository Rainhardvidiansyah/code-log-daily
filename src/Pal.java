import java.util.Locale;

public class Pal {

    private static void isPalindrome(String txt){
        String strings = "";

        for(int i=txt.length(); i>0; i-=1 ){
            String test1 = txt.substring(i-1, i);
            strings += test1;
        }
        if(txt.equals(strings)){
            System.out.println("==== "+txt+" is a Palindrome =====");
        }else{
            System.out.println("==== "+txt+" is not a Palindrome =====");
        }
    }



    public static void main(String[] args) {
        isPalindrome("\"kasur rusak\"");
        isPalindrome("\"121\"");




    }
}
