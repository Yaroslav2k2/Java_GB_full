package OOP_lesson1;

public class Peasant extends Hero{
    public Peasant(String nameHero) {
        super(100, 100, 0, nameHero, new int[]{0,0});
    }

    @Override
    public String toString() {
        return "Копейщик "+NameHero+" здоровье: "+health+"/"+Maxhealth+" броня: "+armor;
    }
}
