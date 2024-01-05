package Lesson3_Seminar;
/*Создать список типа ArrayList
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class test_2 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Iterator<Object> iterator = list.iterator();
        list.add(1);
        list.add(2);
        list.add("kaif");
        list.add(null);
        list.add(1.16);
        list.removeIf(x -> x instanceof Integer);
        System.out.println(list);
//        while (iterator.hasNext()){
//            if(iterator.next() instanceof Integer){
//                iterator.remove();
//            }
//        }
//        System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) instanceof Integer) {
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println(list);
    }
}
