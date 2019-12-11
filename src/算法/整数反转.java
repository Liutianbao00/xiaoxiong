package 算法;

import java.util.Scanner;
import java.util.Stack;

public class 整数反转 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        long temp = 0;
        while(x != 0){
            int  pop = x % 10;
            temp = temp * 10 + pop;
            if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE){
                return 0;
            }
            x = x / 10;
        }
        return (int) temp;
    }
}
