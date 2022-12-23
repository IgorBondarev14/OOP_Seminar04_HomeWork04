public abstract class Shield implements Armor{
    @Override
    public String toString() {
        return String.format("Дополнительная броня - %d", armorPoint());
    }
}
