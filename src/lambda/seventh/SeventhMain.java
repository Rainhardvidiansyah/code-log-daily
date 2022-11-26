package lambda.seventh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeventhMain {



    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("reno");
        names.add("rainhard");
        names.add("hoki");
        names.add("maulida");

        SeventhInterface seventhInterface = (String name) -> {
            String[] nameArr = names.toArray(new String[0]);
            String newName = "";
            for (int i = 0; i < nameArr.length; i++) {
                newName = nameArr[i];
                if(!newName.equals(name)) { //this condition is middleware
                    throw new IllegalStateException("Name not found");
                }
            }
            return newName;
        };

        System.out.println(seventhInterface.findUserName("reno"));


    }
}
