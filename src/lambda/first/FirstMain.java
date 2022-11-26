package lambda.first;

public class FirstMain {
    public static void main(String[] args) {
        FirstInterface fi = () -> {
            return "Halo.....";
        };
        System.out.println(fi.getName());

    }
}
