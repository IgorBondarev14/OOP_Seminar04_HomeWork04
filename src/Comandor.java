public class Comandor extends Warrior<Weapon, Armor>{
    public Comandor(String name, int healthPoint, Weapon weapon, Armor armor) {
        super(name, healthPoint, weapon, armor);
    }

    @Override
    public String toString() {
        return "Командир - " + super.toString();
    }
}
