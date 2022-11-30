package solutions;

import java.util.Scanner;

public class Java_Loop_Two {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int integer =in.nextInt();
        for(int i=0; i < integer ;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0; j < n;j++){
                int sum=a;
                for(int k=0; k < j + 1; k++){
                    sum+=(Math.pow(2, k)*b);
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
