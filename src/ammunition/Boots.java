package ammunition;

public class Boots extends Ammunition{

    /** Свойство - название ботинок */
    private String name;

    /** Свойство - скорость ботинок*/
    private int speed;

    /** Свойство - размер*/
    private Integer size;

    /** Создает новый обьект с задаными значениями
     * @param cost - цена
     * @param weight - вес
     * @param name - название
     * @param speed - скорость
     * @param size - размер
     */
    public Boots(double cost, double weight,
                 String name, int speed, Integer size) {
        super(cost, weight);
        this.name = name;
        this.speed = speed;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    /** Метод для вывода информации о ботинках
     * @return Возвращает полную информацию о ботинках
     */
    @Override
    public String toString() {
        return "Boots{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", size='" + size + '\'' +
                super.toString() +
                '}';
    }
}
