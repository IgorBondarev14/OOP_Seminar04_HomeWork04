import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    List<T> warriors = new ArrayList<>();

    public Comandor getComandor() {
        return comandor;
    }

    public void setComandor(Comandor comandor) {
        this.comandor = comandor;
    }

    private Comandor comandor;

    public Team(Comandor comandor) {

        this.comandor = comandor;
    }

    public void addWarrior(T newwarrior) {
        warriors.add(newwarrior);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getAllDamage(){
        int sumDamage = 0;
        for (T item:warriors) {
            sumDamage += item.getWeapon().damage();
        }
        sumDamage = sumDamage + this.comandor.getWeapon().damage();
        return sumDamage;
    }

    public int getAllHealth(){
        int sumHealth = 0;
        for (T item:warriors) {
            sumHealth += item.getHealthPoint();
        }
        sumHealth = sumHealth + this.comandor.getHealthPoint();
        return sumHealth;
    }

    public int getMaxRadius() {
        int maxRange = 0;
        for (T item: this) {
            Weapon weapon = item.getWeapon();
            if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                if (maxRange < bow.range()) {
                    maxRange = bow.range();
                }
            }
        }
       return maxRange;
    }

    public int getArmor(){
        int sumArmor = 0;
        for (T item:warriors) {
            sumArmor += item.getArmor().armorPoint();
        }
        sumArmor = sumArmor + this.comandor.getArmor().armorPoint();
        return sumArmor;
    }
}
