package cb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ChangeOneCharacter {
    public static void main(String[] args) {
        System.out.println("Change on Character: ");
        System.out.println();


        List<String> list = List.of("rainhard", "hoki", "maulida", "rainhard");

        String[] names = new String[]{"rainhard", "hoki", "maulida"};
        List<String> newName = Arrays.asList("Rainhard", "Maulida", "Hoki");
        String[] target = newName.toArray(new String[0]);

        for (int i = 0; i < target.length ; i++) {
            char s = 'P';
            int position = 0;
            StringBuilder sb = new StringBuilder(target[i]);
            sb.setCharAt(position, s);
            target[i] = sb.toString();
            System.out.print("The Target we're looking for::> " + target[i] + " " + "\n");
        }


        for (int i = 0; i < names.length; i++) {
            char c = 'j';
            int position = 2;
            StringBuilder stringBuilder = new StringBuilder(names[i]);
            stringBuilder.setCharAt(position, c);
            names[i] = stringBuilder.toString();
            System.out.print(names[i]+ " ");
        }


    }
}
