public class Hero {
    private int health;
    private String damage;
    private String superpower;

    public Hero (int health, String damage, String superpower){
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero (int health, int damage){
        health = health;
        damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public String getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}

