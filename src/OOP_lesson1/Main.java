package OOP_lesson1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        WhiteHero = generationComand(0);
        BlackHero = generationComand(3);

        WhiteHero.forEach(n -> System.out.println(n.toString()));
        System.out.println("**************************");
        BlackHero.forEach(n -> System.out.println(n.toString()));

    }
    static ArrayList<Hero> WhiteHero=new ArrayList<>();
    static ArrayList<Hero> BlackHero=new ArrayList<>();

    static ArrayList<Hero> generationComand(int n){
        ArrayList<Hero> command = new ArrayList<>();
        Random random = new Random();
        int randnum;
        for (int i = 0; i < 10; i++) {
            randnum= random.nextInt(1,5)+n;
            switch(randnum){
                case 1:
                    command.add(new Crosbower(getname()));
                    break;
                case 2:
                    command.add(new Monk(getname()));
                    break;
                case 3:
                    command.add(new Peasant(getname()));
                    break;
                case 4 :
                    command.add(new Pikeman(getname()));
                    break;
                case 5:
                    command.add(new Rogue(getname()));
                    break;
                case 6:
                    command.add(new Sniper(getname()));
                    break;
                case 7:
                    command.add(new Wizard(getname()));
                    break;
            }
        }
        return command;
    }

    static String getname(){
        return NameOfHero.values()[new Random().nextInt(NameOfHero.values().length-1)].name();
    }

}
