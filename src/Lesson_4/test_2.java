package Lesson_4;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {
        String user_vvod = "";
        Scanner scaner = new Scanner(System.in);
        boolean flag = true;
        List<String> list = new LinkedList<>();
        while(flag){
            String[] list2 = user_vvod.split(" ");
            System.out.println(">>>>");
            if(list2[0].equals("print")){
                list.removeLast();
                System.out.println(list.reversed());
            } else if (list2[0].equals("revert")) {
                list.removeLast();
                list.removeLast();
                System.out.println(list.reversed());
            }else if (list2[0].equals("end")){
                list.removeLast();
                System.out.println(list);
                flag=false;
            }
            user_vvod = scaner.nextLine();
            list.add(user_vvod);

        }
    }
}
