package solutions;

import java.util.*;

public class ShortestSubstring {



    public static void main(String[] args) {

        findShortestSubstring("ABCBBKABACG");
        // 0 1 2 3 4 5
        // A B C B B K


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
            }
                else{
                    map.put(c, 1);
                }
            }

        int res = 0;
        System.out.println("\n");
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() <= 2){
                //System.out.println(entry.getValue());
                res = entry.getValue();
            }
            System.out.print(entry.getKey() + " ");
        }
        //System.out.println("Res is: " + res);






    }


}
