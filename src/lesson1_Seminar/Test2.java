package lesson1_Seminar;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String words = "Добро пожаловать на курс по Java";
        String[] arrwords= words.split(" ");
        System.out.println(Arrays.toString(arrwords));
        for (int i = arrwords.length-1; i > -1; i--) {
            System.out.print(arrwords[i] + " ") ;
        }

    }
}
