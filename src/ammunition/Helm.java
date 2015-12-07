package ammunition;

public class Helm extends Ammunition {

    /** Свойсто - название шлема*/
    private String name;

    /** Свойство - блокируемый урон */
    private int absorbeDamage;

    /** Свойство - размер */
    private String size;

    /** Создает новый обьект с задаными значениями
     * @param cost - цена
     * @param weight - вес
     * @param name - название
     * @param absorbeDamage - блокируемый урон
     * @param size - размер
     */
    public Helm(double cost, double weight,
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

    /** Метод для вывода информации о шлеме
     * @return Возвращает полную информацию о шлеме
     */
    @Override
    public String toString() {
        return "Helm{" +
                "name='" + name + '\'' +
                ", absorbeDamage=" + absorbeDamage +
                ", size='" + size + '\'' +
                super.toString() +
                '}';
    }
}
