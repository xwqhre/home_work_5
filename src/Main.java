public class Main {
    public static void main(String[] args) {
        Boss theBoss = new Boss(600, 70, "Magical");
        System.out.println("Boss heath: " + theBoss.getHealth());
        System.out.println("Boss damage: " + theBoss.getDamage());
        System.out.println("Boss protection: " + theBoss.getProtectionType());
    }


    public static Hero[] createHeroes() {
        for (int i = 0; i < createHeroes().length; i++) {
            Hero hero = createHeroes()[i];
            System.out.println("Damage: " + hero.getDamage() + " Health: " + hero.getSuperpower());
            Hero heroes = new Hero(20, 120);
            Hero heroes1 = new Hero(15, 155);
            Hero heroes2 = new Hero(25, 90);
            Hero[] allHeroes = new Hero[]{heroes, heroes1, heroes2};
            return allHeroes;
        }
    }

}








