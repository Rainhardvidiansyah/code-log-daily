package cb;

public class FirstFactorial {

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }else {
            return num * factorial(num -1);
        }
    }

    public static void main(String[] args) {
        System.out.println("First Factorial");
        System.out.println();

        var x = factorial(6);
        System.out.println(x);

        //4! = 4 x 3 x 2 x 1 == 24
        //3! = 3 x 2 = 6. 6 x 1 == 6

    }
}
