package lambda.Sixth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SixthMain {

    public static List<String> getCountry(){
        List<String> countries = new ArrayList<>();
        countries.add("Indonesia");
        countries.add("Singapore");
        countries.add("Malaysia");
        return countries;
    }

    public static void main(String[] args) {

        List<String> getOneCountry = getCountry();

        getOneCountry.stream()
                .filter(a -> a.equalsIgnoreCase("indonesia"))
                .filter(b -> b.startsWith("Indonesia"))
                .map(String::toUpperCase)
                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
