package Lesson_4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class test_1 {
    public static void main(String[] args) {
        boolean flag = true;
        String str = null;
        Scanner scaner = new Scanner(System.in);
        List<String> lststr = new LinkedList<>();
        while(flag){
            System.out.println(">>>");
            str = scaner.nextLine();
            String [] list = str.split("~");
            int num = Integer.parseInt(list[1]);
            if(list[0].equals("print")){
                System.out.println(lststr.remove(num));
            }else if (list[0].equals("end")){
                flag=false;
            }else{
                lststr.add(num, list[0]);
            }
        }
    }
}
