package ammunition;

public class Armor extends Ammunition {

    /**  Свойство - название брони */
    private String name;

    /** Свойство - количество блокорованого урона */
    private int absorbeDamage;

    /** Свойство - размер */
    private String size;

    /** Создает новый обьект с задаными значениями
     * @param cost - цена
     * @param weight - вес
     * @param name - имя
     * @param absorbeDamage - блокриванный урон
     * @param size - размер
     */
    public Armor(double cost, double weight,
                 String name, int absorbeDamage, String size) {
        super(cost, weight);
        this.name = name;
        this.absorbeDamage = absorbeDamage;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAbsorbeDamage() {
        return absorbeDamage;
    }

    public void setAbsorbeDamage(int absorbeDamage) {
        this.absorbeDamage = absorbeDamage;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /** Метод для вывода информации о броне
     * @return Возвращает полную информацию о броне
     */
    @Override
    public String toString() {
        return "Armor{" +
                "name='" + name + '\'' +
                ", absorbeDamage=" + absorbeDamage +
                ", size='" + size + '\'' +
                super.toString() +
                '}';
    }
}
