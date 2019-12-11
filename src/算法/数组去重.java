package 算法;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class 数组去重 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,0,0,9,8,7,6,5,4,3,2};
        sort1(a);
//        System.out.println(sort(a));
    }
    public static void sort1(int[] a){
        HashMap map = new HashMap();
        for(int i = 0;i<a.length;i++){
            boolean s = (boolean) map.put(a[i],1);
            if(s == false){
                System.out.println(s);
            }
        }
    }
    public static HashSet sort(int[] a){
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<a.length;i++){
           boolean c =  set.add(a[i]);
           if(c == false){
               System.out.println(a[i]);
           }
        }
        return (HashSet) set;

    }
}
