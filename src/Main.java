public class Main {
    public static void main(String[] args) {
        Comandor comandor = new Comandor("Капитан", 250, new LongBow(), new Bukler());
        Team<Archer> royalArchers = new Team<>(comandor);
        System.out.println("______Королевсие лучники______");
        System.out.println(comandor);
        royalArchers.addWarrior(new Archer("Вася", 150, new LongBow(), new Bukler()));
        royalArchers.addWarrior(new Archer("Петя", 140, new LongBow(), new Bukler()));
        royalArchers.forEach(System.out::println);
        System.out.println("Суммарный урон команды " + royalArchers.getAllDamage());
        System.out.println("Максимальная дальность атаки команды " + royalArchers.getMaxRadius());
        System.out.println("Максимальне очки здоровья команды " + royalArchers.getAllHealth());
        System.out.println("Очки брони команды " + royalArchers.getArmor());
        System.out.println("______Демонические топоры______");
        Comandor comandor1 = new Comandor("Лейтинант", 400, new Sekira(), new HardShield());
        Team<Barbarian> demonAxe = new Team<>(comandor1);
        demonAxe.addWarrior(new Barbarian("FoGJ", 350, new Sekira(), new HardShield()));
        demonAxe.addWarrior(new Barbarian("Karl", 350, new Sekira(), new HardShield()));
        System.out.println(comandor1);
        demonAxe.forEach(System.out::println);
        System.out.println("Суммарный урон команды " + demonAxe.getAllDamage());
        System.out.println("Максимальная дальность атаки команды " + demonAxe.getMaxRadius());
        System.out.println("Максимальне очки здоровья команды " + demonAxe.getAllHealth());
        System.out.println("Очки брони команды " + demonAxe.getArmor());
        System.out.println("______Авария______");
        Comandor comandor2 = new Comandor("Angel",333, new LongBow(), new Bukler());
        Team<Warrior> crash = new Team<>(comandor2);
        System.out.println(comandor2);
        crash.addWarrior(new Archer("Luc", 150, new LongBow(), new Bukler()));
        crash.addWarrior(new Barbarian("Lucius", 150, new Sekira(), new HardShield()));
        crash.forEach(System.out::println);
        System.out.println("Суммарный урон команды " + crash.getAllDamage());
        System.out.println("Максимальная дальность атаки команды " + crash.getMaxRadius());
        System.out.println("Максимальне очки здоровья команды " + crash.getAllHealth());
        System.out.println("Очки брони команды " + crash.getArmor());
    }
}