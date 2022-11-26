package lambda.third;

public class ThirdMain {
    public static void main(String[] args) {
        ThirdInterface thirdInterface = () -> 23.888;
        System.out.println(thirdInterface.getDouble());

        ThirdInterface thirdInterface1 = () -> {
            double pi = 3.2;
            return pi;
        };
        System.out.println("With \"block body\": " + thirdInterface1.getDouble());

    }

}
