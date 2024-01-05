package Lesson2_Seminar;

public class Test_3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
    }

    private static boolean isPalindrome(String s) {
        s=s.replace(" ","");
        StringBuilder n = new StringBuilder(s);
        String reversed = n.reverse().toString();
        System.out.println(n);
        return s.equalsIgnoreCase(reversed);
    }
}
