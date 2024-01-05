/*Дано четное число N (>0) и символы c1 и c2.
Написать метод, который
вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */
package Lesson2_Seminar;

public class Test1 {
    public static void main(String[] args) {
        int N=10;
        N=N/2;
        String c1 = "+";
        String c2 = "-";
        def_test(c1,c2,N);
    }
    static StringBuilder def_test(String c1, String c2, int N){
        StringBuilder news = new StringBuilder();
        for (int i = 0; i < N; i++) {
            news.append(c1);
            news.append(c2);
        }
        System.out.println(news);
        return news;
    }

}
