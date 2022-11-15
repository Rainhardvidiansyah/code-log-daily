package cb;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateElementInArray {

    public static void listToUpper(List<String> list){
        for (String i: list) {
            char[] toUpper = i.toCharArray();
            toUpper[1] = Character.toUpperCase(toUpper[1]);
            i = new String(toUpper);
            System.out.println(i);
        }
    }




    public static void main(String[] args) {
        System.out.println("Find Duplicate Elements in Array: ");
        System.out.println();

        int[] arr = new int[]{2, 3, 4, 77, 1, 2, 4, 8, 90, 44, 4, 32, 32, 6, 7, 76, 8, 4, 2, 44};
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if( i != j && arr[i] == arr[j]){
//                    System.out.print(arr[i]);
                }
            }
        }


        List<String> list = List.of("rainhard", "maulida", "hoki");
        listToUpper(list);

        Set<Integer> set = new HashSet<>();

        for(Integer i : arr){
            if(!set.add(i)){
                set.removeIf(item -> item.equals(i));
                System.out.print(i + " ");
            }
        }

//        String[] str = new String[]{"Indonesia", "Malaysia", "Indonesia", "Singapore", "China"};
//
//       Set<String> stringSet = Arrays.stream(str)
//               .filter(item -> Collections.frequency(Arrays.asList(str), item) > 1).collect(Collectors.toSet());
//        System.out.println(stringSet);

        String[] strings = new String[]{"Jakarta", "Bandung", "Malang", "Jakarta", "Bandung", "Surabaya", "Semarang", "Tangerang", "Jakpus"};
        Set<String> stringSet = new HashSet<>();
        for(String s : strings){
            if(!stringSet.add(s)){
                System.out.println(s + " \n");
            }
        }

        Set<String> s = Arrays.stream(strings).filter(item -> Collections.frequency(Arrays.asList(strings), item) > 1)
                .collect(Collectors.toSet());
        s.forEach(System.out::println);
        String s1 = " ";

        for (int i = 0; i < strings.length; i++){
            char[] upper = strings[i].toCharArray();
            upper[2] = Character.toUpperCase(upper[2]);
//            strings[i] = String.valueOf(upper);
            strings[i] = new String(upper);
            s1 = strings[i];
//            System.out.println(strings[i]);
        }
        System.out.println("Value of S1::>> " + s1);



        var upper = toUpper("string");
        System.out.println(upper);
    }

    public static String toUpper(String str){
        char[] upper = str.toCharArray();
        upper[0] = Character.toUpperCase(upper[0]);
        return str = new String(upper);
    }
}
