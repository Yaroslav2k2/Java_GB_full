package Lesson_6_test_3;

import java.util.List;

public class Cat {
    String name;
    int age;
    String poroda;
    String ownername;

    @Override
    public String toString() {
        return "имя: "+ name+"\n"+"возраст: "+age+"\n"+"порода: "+poroda+"\n"+"Имя хозяина: "+ownername+"\n"+"\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj instanceof Cat){
            Cat cat = (Cat) obj;
            int a =0;
            return true;
        }

        return false;
    }
}
