package Lesson_6_test_3;
/*1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения,
которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.*/

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Cat> cat = new HashSet<>();
        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.age = 10;
        cat1.poroda = "Персидская";
        cat1.ownername = "Мария Иванова";

        Cat cat2 = new Cat();
        cat2.name = "Барс";
        cat2.age = 17;
        cat2.poroda = "котичная";
        cat2.ownername = "Катя Иванова";

        Cat cat3 = new Cat();
        cat3.name = "Рыжик";
        cat3.age = 20;
        cat3.poroda = "Бритиш";
        cat3.ownername = "Маргаритта Юрьевна";

        Cat cat4 = new Cat();
        cat4.name = "Бабкин";
        cat4.age = 12;
        cat4.poroda = "Персидская";
        cat4.ownername = "Мария Иванова";

        Cat cat5 = new Cat();
        cat5.name = "Бабкин";
        cat5.age = 12;
        cat5.poroda = "Персидская";
        cat5.ownername = "Мария Иванова";

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);

        cat.add(cat1);
        cat.add(cat2);
        cat.add(cat3);
        cat.add(cat4);
        cat.add(cat5);
    }
}
