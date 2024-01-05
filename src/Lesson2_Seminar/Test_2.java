/*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Результат: a4b3cd2
 */
package Lesson2_Seminar;
public class Test_2 {
    public static void main(String[] args) {
    String stroka = "aaaabccc cdd";
    char aa = 'a';
    char  bb = 'b';
    char cc = 'c';
    char dd = 'd';
    int a= countOccurrences(stroka,aa);
    defsravnenyi(a,aa);
    int b= countOccurrences(stroka,bb);
    defsravnenyi(b,bb);
    int c= countOccurrences(stroka,cc);
    defsravnenyi(c,cc);
    int d= countOccurrences(stroka,dd);
    defsravnenyi(d,dd);
    }
    private static int countOccurrences(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }
        return counter;
    }
    static char defsravnenyi(int n,char nn){
        if(n!=1){
            System.out.print(nn);
            System.out.print(n);
        }else{
            System.out.print(nn);
        }
        return nn;
    }
}
