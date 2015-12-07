package ammunition;

public abstract class Ammunition {

    /** Свойство - цена амуниции */
    private double cost;

    /** Свойство - вес амуниции */
    private double weight;

    /** Создает новый обьект с задаными значениями
     * @param cost - цена
     * @param weight - вес
     */
    public Ammunition(double cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    /** Метод для вывода информации о амуниции
     * @return Возвращает полную информацию о амуниции
     */
    @Override
    public String toString() {
        return "Ammunition cost: " + cost + " weight: " + weight;
    }
}
