import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,54,65,7,32,2,5,67};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int t = 0;
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }


    }

}


