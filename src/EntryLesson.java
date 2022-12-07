import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EntryLesson {



    public static void main(String[] args) {

        String firstData = "ABCBBK";

        Map < Character, Integer > mapDuplicate = new HashMap < > ();

        // Converts this string to a new character array.
        char[] chars = firstData.toCharArray();
        int d = 0;
        for (char c: chars) {
            if (mapDuplicate.containsKey(c)) {

                // get value by key and increment it's value by a
                mapDuplicate.put(c, mapDuplicate.get(c) + 1);

            } else {
                mapDuplicate.put(c, 1);
            }
        }

        for (Map.Entry< Character, Integer > entry: mapDuplicate.entrySet()) {
            d += entry.getValue();
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }












        for(int i = 0; i < chars.length; i++){
            if(chars[i] == i){
                System.out.println(chars[i]);
            }
        }




    }
}
