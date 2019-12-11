package 算法;

public class 简单股票 {
    public static void main(String[] args) {
        int[] a = {2,9,3,4,5,3,5};
        System.out.println(maxProfit(a));

    }


    public static int maxProfit(int[] prices) {
        int b = 0;
        for(int i = 0;i<prices.length-1;i++){
            for(int j = i + 1; j < prices.length;j++ ){
                int a = prices[j] - prices[i];
                if(a > b){
                    b = a;
                }
            }
        }
        return b;
    }
}
