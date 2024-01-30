package OOP_lesson1;

public class Monk extends Hero {
    public Monk(String nameHero) {
        super(40, 40, 1, nameHero, new int[]{-30,-35});
    }

    @Override
    public String toString() {
        return "Монах "+NameHero+" здоровье: "+health+"/"+Maxhealth+" броня: "+armor;
    }
}
