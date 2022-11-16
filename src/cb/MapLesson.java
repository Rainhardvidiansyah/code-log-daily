package cb;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapLesson {
    public static void main(String[] args) {
        System.out.println("On Map Lesson: ");
        System.out.println();
        Map<String, String> map = new HashMap<>();
        map.put("Jakarta", "DKI");
        map.put("Bandung", "Jabar");
        map.put("Tegal", "Jateng");
        map.put("Surabaya", "Jatim");

        System.out.println(map);
        System.out.println(map.get("Tegal"));
        System.out.println(map.size());
        for (int i =0 ; i< map.size(); i++){
            System.out.println(map.entrySet());
        }

        System.out.println("Looping through its value only: ");
        for (String i : map.keySet()){
            System.out.println(map.get(i));
        }
        System.out.println("Looping through key and its values: ");
        for (String i : map.keySet()){
            System.out.println(i + " " + map.get(i));
        }

        System.out.println("Looping to get value of the map: ");
        for(String i : map.values()){
            System.out.println(i);
        }

        System.out.println("Looping to get the Key only: ");
        for(String i: map.keySet()){
            System.out.println(i);
        }
    }
}
