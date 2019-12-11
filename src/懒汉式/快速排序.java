package 懒汉式;

import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,54,65,7,32,2,5,67};
//        sort(arr);
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println("hsauihdasi");
    }
    public static void sort(int[] arr,int start,int end){
       int low = start;
       int high = end;
       int stard = arr[start];
       if(start < end){
           while(low < high){
               if(low < high && arr[high] >= stard){
                   high--;
               }
               arr[low] = arr[high];
               if(low < high && arr[low] <= stard){
                   low++;
               }
               arr[high] = arr[low];
           }
           stard = arr[low];
           sort(arr,0,low);
           sort(arr,low+1,end);




       }

    }
}
