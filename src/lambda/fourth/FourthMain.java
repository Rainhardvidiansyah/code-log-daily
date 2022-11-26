package lambda.fourth;

public class FourthMain {

    public static void main(String[] args) {
        FourthInterface fourthInterface = (name) -> {
            String newName = "";
            for (int i = name.length()-1; i >= 0; i--) {
                newName = newName + name.charAt(i);
            }
            return newName;
        };
        String name = "Raihard";
        System.out.println(fourthInterface.reverse(name));

        for (int i = 10 -1; i >=1 ; i--) {
            System.out.println(i);
        }

    }
}
