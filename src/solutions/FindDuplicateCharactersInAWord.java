package solutions;

import java.util.*;

public class FindDuplicateCharactersInAWord {

    public static int shortestSubstring(String s) {
        int x = Integer.MAX_VALUE;
        char[] charArr = s.toCharArray();
        int count = 0;
        LinkedHashMap<String, Integer> link = new LinkedHashMap<>();
        for (char character : charArr)
            if (!link.containsKey(character + "")) {
                link.put(character + "", 1);
            } else {
                count = link.get(character + "");
                count++;
                System.out.println("ISI DARI COUNT:>> " +count);
                link.put(character + "", count);
            }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : link.entrySet()) {
            list.add(entry.getValue());
            System.out.print(entry.getKey());
        }

        for (Integer i : list) {
            x = list.get(i);

        }
        System.out.println("\n");
        System.out.println("====");
        return count;
    }

    public static void main(String[] args){
        String s = "ABCBBK";
//        int y = testSubstring(s);
//        System.out.println(y);

//        System.out.println(testUsingMap(s));
        System.out.println(findShortestSubstring(s));

//        System.out.println(getSmallestSubstring(s));
    }



    private static int testSubstring(String s){
        char[] chars = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chars.length ; i++) {
            for (int j = 0; j < i - 1; j++) {
                if(chars[j] == chars[i]){
                    System.out.print(chars[j]); //result
                    list.add(chars[j]);
                }
            }
        }

        System.out.println("\n");
        System.out.println("ISI DARI LIST::>> " + list);
        return list.size();
    }


    private static int usingSet(String s){
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length ; i++) {
            for (int j = 0; j < i - 1; j++) {
                if(chars[j] == chars[i]){
                    System.out.print(chars[j]); //result
                    set.add(chars[j]);
                }
            }
        }

        System.out.println("\n");
        System.out.println(set);
        System.out.println(List.of(set));
        return set.size();

    }


    static int testUsingMap(String s){
        Map < Character, Integer > map = new HashMap < > ();
        char[] charArray = s.toCharArray();

        for (char c: charArray) {
            if (map.containsKey(c)) {

                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int x =  0;
        for (Map.Entry< Character, Integer > entry: map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                x = entry.getValue();
            }
        }
        return x;
    }
















    public static int getSmallestSubstring(String s){
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars){
            if(map.containsKey(c)){
                map.put(c, map.get(c) +1);
            }else {
                map.put(c, 1);
            }
        }

        int cha = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() > 1){
                cha = entry.getValue();
                System.out.println(entry.getKey());
            }
        }
        System.out.println("\n");
        System.out.print("Content of List of Cha" + List.of(cha));
        System.out.println("\n");
        int x = 0;
        for(int i = 0; i < cha; i++){
            x = cha;
        }
        return x;
    }

    public static int findShortestSubstring(String s){ //use this
        int minDistance = Integer.MAX_VALUE;
        int minimum = 0;
        char[] charArr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : charArr){
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                minimum = map.get(c) + 1;
            }else{
                map.put(c, 1);
            }
        }
        int res = 0;
        System.out.println("\n");
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                res = entry.getValue();
            }
            System.out.print(entry.getKey());
        }
        System.out.println("\n");
        System.out.println("Res is: " + res);
        int min = findMax(map);

        if (min < minimum)
            minimum = min;
        return minimum;
    }

    private static int findMax(Map<Character, Integer> map) { //use this
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (Integer value : map.values()) {
            if (value == -1)
                return Integer.MAX_VALUE;
            else {
                max = Math.max(max,value);
                min = Math.min(min,value);
            }
        }
        return max - min;
    }

    private static int getCurrentDistance(List<Character> list) {
        int max = Integer.MAX_VALUE;
        int min = 0;
        int x = 0;
        for (Character value : list) {
            if (value != 1) {
                x = value;}
               // return Integer.MAX_VALUE;}
//            }  else {
//                max = Math.max(max, value);
//                min = Math.min(min, value);
//            }

        }
        return x;
    }












}
