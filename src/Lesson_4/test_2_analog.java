package Lesson_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class test_2_analog {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scaner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while (flag){
            String line = scaner.nextLine();
            switch (line){
                case "print":
                    for(String s:list){
                        System.out.print(s+", ");
                    }
                    break;
                case "revert":
                    System.out.println(list.removeLast());
                    break;
                case "finish" :
                    flag=false;
                    break;
                default:
                    list.add(0,line);
            }
        }
    }
}
