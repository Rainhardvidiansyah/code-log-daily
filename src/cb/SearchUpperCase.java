package cb;

import java.util.List;

public class SearchUpperCase {

    public static void main(String... args) {
        List<Integer> integers = List.of(23, 21, 900, 23, 3, 222, 567, 5);
        var x = searchMaxValue(integers);
        System.out.println("Max Value is::> " + x);

        var y = searchMinValue(integers);
        System.out.println("Min Value is :>> " +y);
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

    public static int searchMinValue(List<Integer> list){
        int S = list.get(0);
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) < S){
                S = list.get(i);
            }
        }
        return S;
    }
}
