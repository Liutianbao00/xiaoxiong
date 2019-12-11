package 算法;

import com.sun.xml.internal.fastinfoset.util.CharArray;

public class 给定字符串按顺序排列 {
    public static void main(String[] args) {
        String s = "dsaiodsandaosi";
        String end = sort(s);
        System.out.println(end);

    }
    public static String sort(String s){
        char[] c = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            for(int j = 0;j<c.length-1-i;j++){
                if(c[j] > c[j+1]){
                    char temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;
                }
            }
        }
        return new String(c);

    }
}
