package knight;

import ammunition.Ammunition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Knight extends Human {

    /** Свойство - уровень рыцаря */
    private int level;

    /** Свойство - уровень здорвья */
    private int health = 100;

    /** Свойство - амуниция персонажа */
    private ArrayList<Ammunition> ammunitions;

    /** Создает новый объект с заданными значениями
     * @param name - имя
     * @param age - возвраст
     * @param level - уровень
     * @param health - уровень здоровья
     * @param ammunitions - амуниция рыцаря
     */
    public Knight(String name, int age,
                  int level, int health, ArrayList<Ammunition> ammunitions) {
        super(name, age);
        this.level = level;
        this.health = health;
        this.ammunitions = ammunitions;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Ammunition> getAmmunitions() {
        return ammunitions;
    }

    public void setAmmunitions(ArrayList<Ammunition> ammunitions) {
        this.ammunitions = ammunitions;
    }

    /** Метод для получения цены амуниции
     * @return Возврашает цену всей амуниции
     */
    public double sum() {

        double sum = 0;
        for(Ammunition amm : ammunitions) {
            double price = amm.getCost();
            sum += price;
        }
        return sum;
    }

    /** Метод для сортировки амуниции по цене */
    public void sortAmmunitionByPrice() {

        Comparator<Ammunition> comp = new Comparator<Ammunition>() {
            @Override
            public int compare(Ammunition o1, Ammunition o2) {
                return Double.compare(o1.getCost(), o2.getCost());
            }
        };

        Collections.sort(ammunitions, comp);
    }

    /** Метод для сортировки амуници по весу */
    public void sortAmmunitionByWeight() {

        Comparator<Ammunition> comp = new Comparator<Ammunition>() {
            @Override
            public int compare(Ammunition o1, Ammunition o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        };

        Collections.sort(ammunitions, comp);
    }

    /** Метод для поиска амуниции в диапазоне цен
     * @param firstPrice - цена, от которой искать амуницию
     * @param secondPrice - цена, до которой искать амуницию
     * @return Возвращает амуницию, которая подпадает под диапазон цен
     */
    public ArrayList<Ammunition> findAmmunutionByPrice(double firstPrice, double secondPrice) {
        ArrayList<Ammunition> ammunution = new ArrayList<>();
        sortAmmunitionByPrice();

        for (Ammunition amm : ammunitions) {

            if (amm.getCost() >= firstPrice && amm.getCost() <= secondPrice){
                ammunution.add(amm);
            }
        }
        return ammunution;
    }

    /** Метод для вывода информации о рыцаре
     * @return Возвращает полную информацию о рыцаре
     */
    @Override
    public String toString() {

        return "Knight{" +
                "level=" + level +
                ", health=" + health +
                ", ammunitions=" + ammunitions +
                '}' + "\n" +
                "Total price = " + sum();
    }
}
