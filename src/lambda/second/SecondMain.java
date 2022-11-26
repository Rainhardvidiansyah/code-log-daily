package lambda.second;

import org.w3c.dom.ls.LSOutput;

public class SecondMain {
    public static void main(String[] args) {
        SecondInterface si = (a, b) -> a / b;

        System.out.println(si.sum(1, 1));

    }



}
