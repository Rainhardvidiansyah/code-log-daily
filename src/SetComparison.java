import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetComparison {

    public static void main(String[] args) {
        Set<Integer> first = Set.of(2, 3, 5, 8, 7, 12);
        Set<Integer> second = Set.of(2, 5, 1, 8, 7, 9, 10, 12);
        Set<Integer> third = Set.of(10, 11, 4, 5, 3, 2, 1, 21);

//        Set union = Stream.concat(s1.stream(),s2.stream()).collect(Collectors.toSet());
        Set<Integer> Union = Stream.concat(first.stream(), second.stream()).collect(Collectors.toSet());
        Set intersect = first.stream().filter(second::contains).collect(Collectors.toSet());
        Set test = first.stream().filter(a -> second.contains(a)).collect(Collectors.toSet());
        Set testOne = first.stream().filter(second::contains).collect(Collectors.toSet());
        System.out.println("Isi test One :>>" + testOne);
        System.out.println(test);
        System.out.println(Union);
        System.out.println(intersect);

        System.out.println("This is first data :>" + first);
        System.out.println("This is second data :>" + second);


        //System.out.println(first.containsAll(second));

    }
}
