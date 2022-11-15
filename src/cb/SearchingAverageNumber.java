package cb;

//given arraylist with 5 elements
//order that element from smaller to the larger

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;

public class SearchingAverageNumber {
    public static void main(String[] args) {
        System.out.println("Basic Input");

        int[] arr = {23, 44, 54, 12, 10, 2, 89};


        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;
        System.out.println(average);

        int avg_val = SearchAverageValue(arr);
        System.out.println("Result of avg val::>> " + avg_val);

        int max_val = maxVal(arr);
        System.out.println("Result of variable Max Val::>> " + max_val);
        int min_val = minVal(arr);
        System.out.println("Result of variable Min Val::>> " + min_val);

        System.out.println("Greater value: ");
        SearchGreaterValue(arr);

        maxValue(arr);
        checkData();

    }

    public static int SearchAverageValue(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
       int average = sum / arr.length;
        return average;
    }

    public static int maxVal(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        return Collections.max(list);
    }

    public static int minVal(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            list.add(arr[i]);
        }
        return Collections.min(list);
    }

    public static void maxValue(int[] arr){
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            max = Math.max(arr[i], max);
        }
        System.out.println("Result of searching max val::>> " + max);
    }

    public static void checkData(){
        int[] arr = {23, 44, 54, 12, 89, 10, 2};
        int L = arr[0]; //23
        int s = arr[0];
        System.out.println("L is 23");
        for (int i = 1; i < arr.length ; i++) {
            System.out.println("Check Data::>> " + arr[i] + " " + (arr[i] > L));
            if(arr[i] > L) {
                L = arr[i];
            } else if (arr[i] < s) {
                s = arr[i];
            }
        }
        System.out.println("L var is::>> " + L);
        System.out.println("S var is::>> " + s);
    }

    public static void SearchGreaterValue(int[] arr){
        int s = arr[0];
        int l = arr[0];

        for(int i = 1; i< arr.length; i++) {
            if(arr[i] > l) {
                l = arr[i];
            }
            else if (arr[i] < s) {
                s = arr[i];
            }
        }
        System.out.println("Large Number is::>> " + l);
        System.out.println("Small Number is::>> " + s);
    }
}
