public abstract class Warrior<T extends Weapon, S extends Armor> {
    private String name;
    private int healthPoint;
    private T weapon;

    public S getArmor() {
        return armor;
    }

    public void setArmor(S armor) {
        this.armor = armor;
    }

    private S armor;

    public Warrior(String name, int healthPoint, T weapon, S armor) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public T getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s. Здоровье: %d. Оружие: %s. Броня: %s", name, healthPoint,weapon,armor);
    }
}
