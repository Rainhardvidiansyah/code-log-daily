package cb;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(32);
        list.addLast(29);
        list.add(44);
        list.add(13);
        System.out.println(list);

        list.addLast(90);
        System.out.println(list);
        int num = 0;
        for(Integer i: list){
            num += i;
        }
        System.out.println(num);


    }

}
