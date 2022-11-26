import java.util.HashMap;
import java.util.Map;

public class MapEntryTest {
    public static void main(String[] args) {
        System.out.println("On Map Entry Interface: ");
        System.out.println();

        Map<String, String> map = new HashMap<>();
        map.put("r", "a");
        map.put("m", "a");

        for (String i : map.keySet()){
            System.out.println(i);
        }

        for (Map.Entry<String, String> name : map.entrySet()){

        }



    }
}
