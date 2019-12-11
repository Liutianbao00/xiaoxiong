package daBaoTest;

import java.util.ArrayList;
import java.util.List;

public class twoThread extends Thread{
    public static void main(String[] args) {
        twoThread test = new twoThread();
        twoThread test1 = new twoThread();
        test.start();
        test1.start();
    }

    @Override
    public void run() {
        List<Integer> list = new ArrayList();
        long start1 = System.currentTimeMillis();
        for(int i = 0;i<10000000;i++){
            list.add(i);
        }
        long start2 = System.currentTimeMillis() - start1;
        System.out.println(start2);

        long start3 = System.currentTimeMillis();
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0;i<10000000;i++){
            list1.add(i);
        }
        long start4 = System.currentTimeMillis() - start3;
        System.out.println(start4);
    }
}
