package impl;

import java.util.List;

public class ServiceImpl implements Data{


    @Override
    public String getName(String name) {
        return "Halo " + name;
    }

    @Override
    public void getNumber(int number) {
        System.out.println(number);
    }

    @Override
    public List<Integer> add(List<Integer> number) {
        return number;
    }

    @Override
    public String toString() {
        return "ServiceImpl{}";
    }
}
