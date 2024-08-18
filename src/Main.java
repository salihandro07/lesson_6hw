public class Main {
    public static void main(String[] args) {


        Weapon excalibur = new Weapon(WeaponType.EXCALIBUR, "Excalibur");
        Weapon bow = new Weapon(WeaponType.BOW, "Light_sword");
        Weapon magic = new Weapon(WeaponType.MAGIC_WAND, "Magic_wand");

        Boss boss = new Boss(1000, 100, magic);
        System.out.println("Boss Info: ");
        boss.printInfo();

        Skeleton skeleton1 = new Skeleton(200, 50, bow, 37);
        Skeleton skeleton2 = new Skeleton(210, 55, bow, 30);

        System.out.println("Skeleton 1 Info: ");
        skeleton1.printInfo();

        System.out.println("Skeleton 2 Info: ");
        skeleton2.printInfo();
    }
}