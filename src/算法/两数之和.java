package 算法;

public class 两数之和 {
    public static void main(String[] args) {
        int x = 10;
        int[] arr = {1,23,3,1,54,32,5,5,9};
        System.out.println(sort(arr,2));
    }
    public static int[] sort(int[] arr, int x){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;i<arr.length;j++){
                if(x == arr[i] + arr[j]){
                    return new int[] {i,j};
                }

            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
