package daBaoTest;

import java.util.ArrayList;
import java.util.List;

public class daBao_List{
    public static void main(String[] args) {

        test();
    }
    public static void test(){
        List<Integer> list = new ArrayList();
        long start1 = System.currentTimeMillis();
        for(int i = 0;i<50000000;i++){
            list.add(i);
        }
        long start2 = System.currentTimeMillis() - start1;
        System.out.println(start2);

        long start3 = System.currentTimeMillis();
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0;i<50000000;i++){
            list1.add(i);
        }
        long start4 = System.currentTimeMillis() - start3;
        System.out.println(start4);

    }
}
