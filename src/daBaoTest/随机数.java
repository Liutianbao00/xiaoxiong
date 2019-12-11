package daBaoTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class 随机数 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(38);
        list.add(49);
        Random random = new Random();
        for (int i = 0; i < 5;i++){
            System.out.println(list.get(random.nextInt(4)));
        }

    }
}
