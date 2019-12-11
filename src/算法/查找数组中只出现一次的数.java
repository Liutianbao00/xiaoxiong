package 算法;

import java.util.Arrays;

public class 查找数组中只出现一次的数 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8};
        sort(a);
    }

    public static void sort(int[] a){
        for(int i = 1;i<a.length;i++){
            a[0] = a[0] ^ a[i];
        }
        System.out.println(a[0]);
    }
}
