package solutions;

import java.util.*;

public class ShortestSubstring {




    public static void main(String[] args) {

        String ab = "ABCBBK";
        char[] charArr = ab.toCharArray();
        Map<Character, Integer> maps = new HashMap<>();
        for(char c : charArr){
            if(maps.containsKey(c)){
                int counter = maps.get(c);
                maps.put(c, ++counter);
            }else {
                maps.put(c, 1);
            }
        }

        for(char c: maps.keySet()){
            if(maps.get(c) == 1){
                System.out.println(c);
            }
        }

        System.out.println(maps);

        System.out.println("Print using entry");
        for (Map.Entry<Character, Integer> entry : maps.entrySet()){
            if(entry.getKey() > 1){
                System.out.print(entry);
            }
        }


























//
//
//
//
//        Map<Integer, String> map = new HashMap<Integer, String>();
//
//        // Mapping string values to int keys
//        map.put(10, "Geeks");
//        map.put(15, "4");
//        map.put(20, "Geeks");
//        map.put(25, "Welcomes");
//        map.put(30, "You");
//        map.put(35, "You");

//        String s = map.get(25);
//        System.out.println(s);
//
//        s = map.get(10);
//        System.out.println(s);



    }

    //given ABCBBK
    //delete "BB"
    //then return 2
    //Cause the duplicate is two chars

    public static void findShortestSubstring(String s){
        char[] charArr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : charArr){
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                System.out.print("Apa Isinya " + c + " "); // di sini hasilnya BBB. tinggal substring.
            }else{
                map.put(c, 1);
            }
            }

        int res = 0;
        System.out.println("\n");
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getValue());
                res = entry.getValue();
            }
            System.out.print(entry.getKey() + " \n");
        }
        System.out.println("Res is: " + res);
    }


}
