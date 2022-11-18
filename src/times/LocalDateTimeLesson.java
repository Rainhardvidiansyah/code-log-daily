package times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//given an input, like String data in List container. Delete a certain data within in certain time
//if a time has been running in one minute remove a list in index(2)

public class LocalDateTimeLesson {
    public static void main(String[] args) {
        System.out.println("Local Date Time Lesson: ");
        System.out.println();

        List<String> list = new ArrayList<>();
        list.add("rainhard");
        list.add("r");
        list.add("m");

        System.out.println(list.get(2));

        LocalDateTime l = LocalDateTime.now();

        LocalDateTime localDateTime = l.plusMinutes(2);
//        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2022, Month.NOVEMBER, 17);
        System.out.println("A Local Date variable: " + localDate);




    }
}
