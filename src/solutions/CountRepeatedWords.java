package solutions;

import java.util.*;
import java.util.stream.Collectors;

public class CountRepeatedWords {
    public static void main(String[] args) {
        int a = shortestSubstring("abcbbk");
         System.out.println(a);

    }


    public static int shortestSubstring(String s) {
        int x = 0;
        char[] charArray = s.toCharArray();
        LinkedHashMap<String, Integer> link = new LinkedHashMap<>();
        for (char character : charArray)
            if (!link.containsKey(character + "")) {
                link.put(character + "", 1);
            } else {
                int count = link.get(character + "");
                count++;
                link.put(character + "", count);
            }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : link.entrySet()) {
            list.add(entry.getValue());
            System.out.print(entry.getKey());
        }
        //Collections.sort(list);

        for (Integer i : list) {
            x = list.get(i);
        }
        System.out.println("\n");
        System.out.println("====");
        return x;
    }









}
















//    public static int shortest(String s) {
//        Set<String> letters = new HashSet<>();
//        for (Character c : s.toCharArray()) {
//            letters.add(c.toString().toLowerCase());
//        }
//
//        System.out.println("\nSTRING: " + s);
//        System.out.println("LENGTH: " + s.length());
//        System.out.println("SET OF CHARS: " + Arrays.toString(letters.toArray()));
//        String shortestStr = "";
//        int shortest = s.length();
//        int startIndex = 0;
//        int endIndex = letters.size();
//
//        while (endIndex <= s.length()) {
//            boolean validStr = true;
//            int currentLength = 0;
//            String currentSbString = s.substring(startIndex, endIndex);
//            for (String letter : letters) {
//                if (!currentSbString.contains(letter)) {
//                    validStr = false;
//                    break;
//                }
//            }
//
//            if (validStr) {
//                currentLength = currentSbString.length();
//                if (currentLength < shortest) {
//                    shortestStr = currentSbString;
//                    shortest = currentLength;
//                }
//
//                startIndex = endIndex;
//                endIndex = endIndex + letters.size();
//            } else {
//                endIndex++;
//            }
//
//        }
//
//        System.out.println("SUB-STRING: " + shortestStr);
//        return shortest;
//    }
//
//
//    public static int shortestSubstringthree(String s) {
//        // Write your code here
//
//        HashSet<Character> charset = new HashSet<>();
//        HashSet<Character> check = new HashSet<>();
//
//        for(char c : s.toCharArray()){
//            charset.add(c);
//        }
//
//
//        int start =0, min=0, ans=Integer.MAX_VALUE;
//
//        for(int i=0; i< s.length(); i++){
//
//            check.add(s.charAt(i));
//
//            if(check.size() == charset.size()){
//                if(s.charAt(start) == s.charAt(start+1)){
//                    start++;
//                }
//                check.clear();
//                min = i-start +1;
//                start = i+1;
//                ans = Math.min(ans, min);
//            }
//
//            //ans = Math.min(ans, min);
//
//        }
//        System.out.println(ans);
//        return ans;
//
//    }
//
