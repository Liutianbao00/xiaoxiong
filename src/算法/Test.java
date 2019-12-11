package 算法;

public class Test {
    public static boolean test(String a, String target) {
        if (a == null || a.length() == 0) return false;

        for (int i = 0; i <= a.length(); i++){
            for (int j = i; j <= a.length(); j++) {
                if (target.equals(a.substring(i, j))) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Test.test("abcd", "ac"));
    }

}
