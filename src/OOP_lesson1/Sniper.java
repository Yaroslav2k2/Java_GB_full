package OOP_lesson1;

public class Sniper extends Hero{
    public Sniper(String nameHero) {
        super(40, 40, 3, nameHero, new int[]{60,65});
    }
    int tempstrelby; // темп стрельбы(время перед след выстрелом)
    int[] doubledamage; //двойной выстрел

    @Override
    public String toString() {
        return "Снайпер "+NameHero+" здоровье: "+health+"/"+Maxhealth+" броня: "+armor;
    }
}
