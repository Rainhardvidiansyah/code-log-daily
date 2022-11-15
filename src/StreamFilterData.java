import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterData {

    public static void main(String[] args) {
        List<Integer> list = List.of(20, 3, 2, 11, 33, 32, 54, 33);
        list.stream().filter(item -> item % 2 == 0)
                .forEach(System.out::println);

        List<String> str = List.of("Rainhard", "vIdiansyah", "zapuTra");
        str.stream().filter(
                item -> Character.isUpperCase(item.charAt(0))
        ).forEach(System.out::println);

        String s = "rAinHarD"; //find the uppercase
        String up = "";

        for (int i = 0; i < s.length() ; i++) {
            if(Character.isUpperCase(s.charAt(i))){
                char c = s.charAt(i);
                up += c + " ";
            }
        }
        System.out.println("Uppercase Letter:>> " + up);


        String xx = "MaUlidA";
        xx.chars().filter(Character::isUpperCase)
                        .forEach(c -> System.out.println((char) c + " "));
    }
}
