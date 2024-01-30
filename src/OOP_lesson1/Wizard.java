package OOP_lesson1;

public class Wizard extends Hero {


    public Wizard(String nameHero) {
        super(65, 65, 2, nameHero, new int[]{40,50});
    }

    int mana; // количество маны для заклинания
    int maxmana; // максимальное количество маны

    int[] magicdamage; //заклинание урона
    int[] magicheal; // заклинание хилка тех кто рядом в радиусе 3 на 20%

    @Override
    public String toString() {
        return "Волшебник "+NameHero+" здоровье: "+health+"/"+Maxhealth+" броня: "+armor;
    }
}
