package 算法;

public class Test1 {
    public static boolean test(String a, String target) {
        if (a.length()==0 || target.length() == 0){
            return false;
        }
        for(int i = 0;i<a.length();i++){
                if(target.equals(a.substring(i,i+target.length()+1))){
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Test1.test("abcd", "cd"));
        System.out.println(Test1.te("abcd", "cd"));

    }
    public static boolean te(String a, String target) {
        if (a == null || a.length() == 0) return false;

        for (int i = 0; i < a.length(); i++){
            for (int j = i; j < a.length(); j++) {
                if (target.equals(a.substring(i, j))) return true;
            }
        }
        return false;
    }


}
