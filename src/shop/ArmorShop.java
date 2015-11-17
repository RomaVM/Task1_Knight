package shop;

import ammunition.*;

import java.util.AbstractList;

public class ArmorShop {

    public void buy(AbstractList<Ammunition>  ammunitions, String ... ammun) {
        for (int i = 0; i < ammun.length; i++) {
            ammunitions.add(ammunutionType(ammun[i]));
        }
    }

    private Ammunition ammunutionType(String type) {
        switch (type) {
            case "Armor":
                return new Armor(50, 5000, "Chain-mail", 20, "M");
            case "Helm":
                return new Helm(20, 500, "Iron helm", 10, "M");
            case "Boots":
                return new Boots(20, 200, "Leather boots", 20, 43);
            case "Sword":
                return new Sword(100, 1000, "Sharp sword", 85, false);
            default:
                System.out.println("Shop dont have this type of ammunition");
                return null;
        }
    }
}
