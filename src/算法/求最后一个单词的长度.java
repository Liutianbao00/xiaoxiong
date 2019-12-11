package 算法;

import java.util.Scanner;

public class 求最后一个单词的长度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String s = sc.nextLine();
        System.out.println("最后一个单词是：" + lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        String[] ars = s.split(" ");
        String a = ars[ars.length-1];
        return a.length();
    }
}
