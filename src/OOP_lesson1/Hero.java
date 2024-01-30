package OOP_lesson1;

public abstract class Hero{
    protected int health,Maxhealth,armor;
    String NameHero;
    int[] damage;

    public Hero(int health, int maxhealth, int armor, String nameHero, int[] damage) {
        this.health = health;
        Maxhealth = maxhealth;
        this.armor = armor;
        NameHero = nameHero;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", Maxhealth=" + Maxhealth +
                ", armor=" + armor +
                ", Name='" + NameHero + '\'' +
                '}';
    }
}
