import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrStream {

    public static void printArr(int[] arr){
        for (int j : arr) {
            if (j == 90) {
                System.out.println(j + " Got it");
            }
        }
        IntStream stream = Arrays.stream(arr);
        stream.map(a -> a * 2)
                .forEach(System.out::println);
    }


    public static String printArrStr(String[] arr){
        Stream<String> streamString = Arrays.stream(arr, 0, 4);
        streamString.forEach(a -> System.out.println(a + " "));
        return "";
    }

    public static void main(String[] args) {

        //printArr(new int[]{1, 90, 33, 55});
        String firstPrint = printArrStr(new String[]{"Rainhard", "Maulida", "Hoki", "Kucing", "Lucu"});
        System.out.println(firstPrint);




    }
}
