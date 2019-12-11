import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,54,65,7,32,2,5,67};
//        sort(arr);
//        System.out.println(Arrays.toString(arr));
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr,int start,int end){
        int stard = arr[start];
        int low = start;
        int high = end;
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
            sort(arr,0,low);
            sort(arr,low+1,end);

        }
    }




















    public static void sort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int mindex = i;
            for(int j = i+1;j<arr.length;j++){
                if (arr[j] < arr[mindex] ){
                    mindex = j;
                }
            }
            if(i != mindex){
                int tem = arr[i];
                arr[i] = arr[mindex];
                arr[mindex] = tem;
            }
        }
    }





    }
