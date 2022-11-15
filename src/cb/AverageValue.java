package cb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageValue {
    public static void main(String[] args) {
        System.out.println("Average value using maptoint: ");
        System.out.println();
        List<Integer> list = new ArrayList<>(Arrays.asList(33, 567, 809, 234, 56, 1, 76, 23));
        avgVal(list);
        var x = avgValUsingLoop(list);
        System.out.println("Average value using looping::>> " + x);
    }

    public static void avgVal(List<Integer> list){
        System.out.println("Average Value using stream::>> " + list.stream().mapToInt(p -> p)
                .average().getAsDouble()
        );
    }

    public static double avgValUsingLoop(List<Integer> list){
        var num = 0;
        for(int i = 0; i < list.size(); i++){
            num = num + list.get(i);
        }
        return num / list.size();
    }
}
