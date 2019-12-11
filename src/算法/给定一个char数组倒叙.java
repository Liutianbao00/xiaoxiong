package 算法;

public class 给定一个char数组倒叙 {
    public static void main(String[] args) {
        char[] s = {'a','b','c','d'};
        reverseString(s);
        System.out.println(s);
    }
    public static void reverseString(char[] s) {
        int low = -1;
        int high = s.length;
        while(++low < --high){
            char[] a = {'1'};
;            a[0] = s[high];
             s[high] = s[low];
             s[low] = a[0];
        }
    }
}
