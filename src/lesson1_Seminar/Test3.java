package lesson1_Seminar;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("a:");
        int  aa  = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("b:");
        int  bb  = b.nextInt();
        System.out.println(pow(aa,bb));
    }
    public static double pow(int value, int powValue) {
        return (int) Math.pow(value, powValue);
    }

}
