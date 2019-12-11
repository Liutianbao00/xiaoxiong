package 算法;

public class 二分查找发 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(sort(arr,2));

    }
    public static int sort(int[] arr,int x){
        int low = 0;
        int high = arr.length-1;
        if(low == high){
            return 1;
        }
        while(low < high){
            int middle = (low + high)/2;
            if(x == arr[middle]){
                return middle;
            }else if(x < arr[middle]){
                high = middle - 1;
            }else{
                low = middle + 1;
            }
        }
        return -1;
    }
}
