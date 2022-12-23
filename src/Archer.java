public class Archer extends Warrior<Bow, Shield>{
    public Archer(String name, int healthPoint, Bow weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);

    }

    @Override
    public String toString() {
        return "Лучник - " + super.toString();
    }
}
