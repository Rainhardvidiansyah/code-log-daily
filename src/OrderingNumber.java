import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OrderingNumber {


    public static void main(String[] args) {
      int[] arr = new int[]{1, 2, 3, 4, 10, 11};
      int sum = 0;
        for(int i = 0; i < arr.length; i++){
           sum += arr[i];
        }

        System.out.println(sum);

    }
}
