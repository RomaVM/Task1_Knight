package ammunition;

public class Sword extends Ammunition {

    private String name;
    private int damage;
    private boolean oneHanded;

    public Sword(double cost, double weight,
                 String name, int damage, boolean oneHanded) {
        super(cost, weight);
        this.name = name;
        this.damage = damage;
        this.oneHanded = oneHanded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isOneHanded() {
        return oneHanded;
    }

    public void setOneHanded(boolean oneHanded) {
        this.oneHanded = oneHanded;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", oneHanded=" + oneHanded +
                super.toString() +
                '}';
    }
}
