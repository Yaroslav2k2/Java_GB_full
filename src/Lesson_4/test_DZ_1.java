package Lesson_4;

import java.util.LinkedList;

public class test_DZ_1 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        ll.add(1);
        ll.add("One");
        ll.add(2);
        ll.add("Two");
        System.out.println(ll);
        reversarr(ll);

    }
    static void reversarr(LinkedList<Object> ll){
        LinkedList<Object> ll2 = new LinkedList<>();
        for (Object i : ll) {
            ll2.addFirst(i);
        }
        System.out.println(ll2);
    }
}
