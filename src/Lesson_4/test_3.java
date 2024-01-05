package Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class test_3 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,};
//        printarr(arr);
        printarro(arr);
    }
    static void printarro(Integer[] arr){
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
    static void printarr(Integer[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
//        System.out.println(stack);
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
}
