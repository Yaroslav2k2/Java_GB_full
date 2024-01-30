package OOP_lesson1;

public class Pikeman extends Hero{

    public Pikeman(String nameHero) {
        super(70, 70, 5, nameHero, new int[]{0,0});
    }
    int[] villa; //удар вилами
    int[] hilka; //лечение на 10%


    @Override
    public String toString() {
        return "Крестьянин "+NameHero+" здоровье: "+health+"/"+Maxhealth+" броня: "+armor;
    }
}
