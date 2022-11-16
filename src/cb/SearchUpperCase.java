package cb;

import java.util.*;
import java.util.stream.Collectors;

public class SearchUpperCase {

    public static void main(String... args) {
        List<Integer> list = List.of(23, 21, 900, 23, 3, 222, 567, 5, 900, 21, 34, 33, 34);
        var x = searchMaxValue(list);
        System.out.println("Max Value is::> " + x);

        var y = searchMinValue(list);
        System.out.println("Min Value is :>> " +y);
        System.out.println("Duplicate values are::>> ");
        findDuplicateArrays(list);
        getDuplicateValueInArrays(List.of(23, 21, 900, 23, 3, 222, 567, 5, 900, 21, 34, 33, 34));

    }

    public static int searchMaxValue(List<Integer> list){
        int L = list.get(0);
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) > L){
                L = list.get(i);
            }
        }
        return L;
    }

    public static int searchMinValue(List<Integer> list) {
        int S = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < S) {
                S = list.get(i);
            }
        }
        return S;
    }

    public static void searchDuplicateValue(List<Integer> list){
        Set<Integer> set = new HashSet<>();
        for(Integer i : list){
            if (!set.add(i)){
                System.out.println(i);
            }
        }
    }
    public static void findDuplicateArrays(List<Integer> list){
        Integer[] newArr = list.toArray(new Integer[0]);
        Set<Integer> set = Arrays.stream(newArr).filter(item -> Collections.frequency(Arrays.asList(newArr), item)> 1)
                .collect(Collectors.toSet());
//      set.forEach(data -> System.out.println("Duplicate values are::>> " +  data.toString()));
        for (Integer i: set){
            System.out.println("Duplicate values are::> ");
            System.out.println(i);
        }
    }

    public static void getDuplicateValueInArrays(List<Integer> list){
        System.out.println("Duplicate elements are::>>");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() ; j++) {
                if(list.get(i) == list.get(j)){
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
