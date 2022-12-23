public class Bukler extends Shield{
    @Override
    public int armorPoint() {
        return 50;
    }

    @Override
    public String toString() {
        return "Щит маленький: " + super.toString();
    }
}
