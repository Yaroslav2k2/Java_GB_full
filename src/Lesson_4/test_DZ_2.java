package Lesson_4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test_DZ_2 {
    public static void main(String[] args) {
        Deque<Integer> ll = new LinkedList<>();
        Scanner scaner = new Scanner(System.in);
        boolean flag = true;
        Integer n = null;
        String s = null;
        System.out.println("Введите метод:"+"\n"
                +"enequeue-add"+"\n"
                +"dequeue-первый элемент из очереди и удаляет его" + "\n"+
                "first-первый элемент из очереди, не удаляя"+"\n"+
                "getElement-print");
        while(flag){
            s = scaner.nextLine();
            switch (s){
                case "enequeue":
                    System.out.println("Введите число:");
                    n= scaner.nextInt();
                    ll.addLast(n);
                    break;
                case "dequeue":
                    while (!ll.isEmpty()){
                        ll.pop();
                        break;
                    }
                case "first":
                    while (!ll.isEmpty()){
                        ll.peekFirst();
                        break;
                    }
                default:
                    while (!ll.isEmpty()){
                        System.out.println(ll);
                        break;
                    }
            }
        }
    }
}
