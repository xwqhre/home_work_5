public class Boss {
    private int health;
    private int damage;
    private String protectionType;

    public Boss (int health, int damage, String protectionType){
        this.health = health;
        this.protectionType = protectionType;
        this.damage = damage;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(String protectionType) {
        this.protectionType = protectionType;
    }
}
