package cb;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCharInString {
    public static void main(String[] args) {
        System.out.println("Find Duplicate chars in a String");
        System.out.println();

        String[] strings = new String[]{"a,a,b,c,b,c,d,e,b,d,z,z,yx,x", "o,p,q,sq,f,o"};

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < strings.length ; i++) {
            char[] c = strings[i].toCharArray();

        }

        String p = "";
        for (int i =0; i < strings.length; i ++ ){
            var x = countDuplicateCharacters(strings[i]);
            p += x;
        }
        System.out.println("Isi P: " + p);





    }


        public static void getDuplicateCharInString(String[] arr){
            String c= arr[0];
            for (int i = 0; i < arr.length ; i++) {
                c = arr[i];
            }
            Map<Character, Long> result = c.chars()
                    .mapToObj(item -> (char) item)
                    .collect(Collectors.groupingBy(item -> item, Collectors.counting()));
            result.forEach((ch, l) -> {
                System.out.println(l + ": " + ch);
            });
    }

         public static void Test(){
            System.out.println("Test");
        }

        public static void findDuplicateChar(String[] arr){
        String s = "";

            Map<Character, Integer> maps = new HashMap<>();
            for (int i = 0; i < arr.length ; i++) {
                char[] chars = arr[i].toCharArray();
                for (char c : chars){
                    if(maps.containsKey(c)){
                        maps.put(c, maps.get(c) + 1);
                    }else {
                        maps.put(c, 1);
                    }
                    for (Map.Entry<Character, Integer> entry : maps.entrySet()){
                        if(entry.getValue()>1){
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                            //s += ": " + entry.getValue();
                        }
                    }
                }
            }
        }

    public static String countDuplicateCharacters(String str) {

        // Creating a HashMap containing char
        // as a key and occurrences as a value
        String s = "";
        Map<Character, Integer> map
                = new HashMap<Character, Integer>();

        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();

        // Checking each character
        // of charArray
        for (char c : charArray) {

            if (map.containsKey(c)) {

                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            }
            else {

                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }

        // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {

            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey()
//                        + " : "
//                        + entry.getValue());
                s = s + entry.getKey();
            }
        }
        return s;
    }




}
