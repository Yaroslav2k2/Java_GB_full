package OOP_lesson1;

public class Crosbower extends Hero {

    public Crosbower(String nameHero) {
        super(50, 50, 3, nameHero, new int[]{50,55});
    }
    int tempstrelby; // темп стрельбы(время перед след выстрелом)
    int[] poisondamage; //отравление в течении 5 сек поотеря хп каждую сек на 5%

    @Override
    public String toString() {
        return "Арбалетчик "+NameHero+" здоровье: "+health+"/"+Maxhealth+" броня: "+armor;
    }
}
