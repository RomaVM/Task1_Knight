package knight;

import ammunition.Ammunition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Knight extends Human {

    private int level;
    private int health = 100;
    private ArrayList<Ammunition> ammunitions;

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

    public double sum() {

        double sum = 0;
        for(Ammunition amm : ammunitions) {
            double price = amm.getCost();
            sum += price;
        }
        return sum;
    }

    public void sortAmmunitionByPrice() {

        Comparator<Ammunition> comp = new Comparator<Ammunition>() {
            @Override
            public int compare(Ammunition o1, Ammunition o2) {
                return Double.compare(o1.getCost(), o2.getCost());
            }
        };

        Collections.sort(ammunitions, comp);
    }

    public void sortAmmunitionByWeight() {

        Comparator<Ammunition> comp = new Comparator<Ammunition>() {
            @Override
            public int compare(Ammunition o1, Ammunition o2) {
                return Double.compare(o1.getWeight(), o2.getWeight());
            }
        };

        Collections.sort(ammunitions, comp);
    }

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
