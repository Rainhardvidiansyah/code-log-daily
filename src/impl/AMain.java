package impl;

import java.util.List;

public class AMain {

    public static void main(String[] args) {
        Data data = new ServiceImpl();

//        String getName = data.getName("Rainhard");
//        System.out.println(getName);
//        data.getNumber(99);

        System.out.println(data.add(List.of(1, 23, 33, 22)));
    }
}
