package cb;

import java.util.Arrays;

public class WordCount {

    public static int wordCount(String str){
        String[] words = str.split(" ");

        if(str.length() > 0){
            return words.length;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Word Count");
        var x = wordCount("string is good thing in programming");
//        System.out.println(x);
        String data = "Data";
        String[] news = data.split(" test ");
        System.out.println(Arrays.toString(news));
    }
}
