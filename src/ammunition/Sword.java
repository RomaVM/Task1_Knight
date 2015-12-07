package ammunition;

public class Sword extends Ammunition {

    /** Свойство - название */
    private String name;

    /* Свойство - урон */
    private int damage;

    /* Свойство - одноручное оружие */
    private boolean oneHanded;

    /** Создает новый обьект с задаными значениями
     * @param cost - цена
     * @param weight - вес
     * @param name - название
     * @param damage - урон
     * @param oneHanded - одноручное ли?
     */
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

    /** Метод для вывода информации о мече
     * @return Возвращает полную информацию о мече
     */
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
