package 算法;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class 判断单词是否出现在字符串中 {
    public static void main(String[] args) {
        String str = "asdfghjhaba";
        String str1 = "ab";
        System.out.println(sort(str,str1));
    }
    public static Queue aaa(String str){
        Queue<Character> stack = new ArrayDeque<>();
        for (int i=0;i<str.length();i++){
            stack.add(str.charAt(i));
        }
        return stack;
    }
    public static boolean sort(String str,String str1){
        Queue<Character> stack1 = new ArrayDeque<>();
        stack1 = aaa(str1);
        for(int i = 0;i<str.length();i++){

            if (str.charAt(i)==stack1.poll()){
                if (stack1.isEmpty()){
                    return true;
                }
            }else {
                stack1 = aaa(str1);
            }
        }
        return false;
    }
}
