public class HardShield extends Shield {
    @Override
    public int armorPoint() {
        return 75;
    }

    @Override
    public String toString() {
        return "Щит тяжелый: " + super.toString();
    }
}
