package Lesson3_Seminar;
/*Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.*/

import java.util.*;

public class test_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        random(list);
        System.out.println(list);
        sorted(list);
        System.out.println(list);
    }

    static void random(List<Integer> list){
        Random  rand = new Random();
        int a= 0;
        for (int i = 0; i < 10; i++) {
            a = rand.nextInt(100);
            list.add(a);
        }
    }

    static void sorted(List<Integer> list){
        Collections.sort(list);
    }
}
