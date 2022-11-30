package solutions;

import java.util.Scanner;

public class End_of_File {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNext()){
            try{
                System.out.println(i + " " + scan.nextLine());
                i++;
                if(i == 4){
                    break;
                }

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

    }
}
