package OOP_lesson1;

public class Rogue extends Hero{

    public Rogue(String nameHero) {
        super(100,
                100,
                5,
                nameHero,
                new int[]{20,30});
    }
    int[] krit; //критический удар
    int[] prok; //срабатывание какого-либо эффекта при определенных условиях


    @Override
    public String toString() {
        return "Разбойник "+ NameHero+" здоровье: "+health+"/"+Maxhealth+" броня: "+armor;
    }
}
