package Lesson_6;

import java.util.Random;
import java.util.Arrays;
import java.util.HashSet;

public class test_2 {
    public static void main(String[] args) {
        int len = 1000;
        int min = 0;
        int max = 24;
        Integer[] arr = rand(min,max,len);
        System.out.println(unik(arr));
    }
    static Integer[] rand(int min,int max,int len){
        Integer[] res = new Integer[len];
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            res[i] = random.nextInt(min,max+1);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    static double unik(Integer[] arr){
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);
        return set.size() * 100.00 / arr.length;
    }
}
