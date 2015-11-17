package view;

import knight.Knight;
import shop.ArmorShop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Knight kn1 = new Knight("Roman", 20, 45, 100, new ArrayList<>());
        ArmorShop shop = new ArmorShop();

        shop.buy(kn1.getAmmunitions(), "Sword", "Helm");
        System.out.println(kn1);

        kn1.sortAmmunitionByPrice();
        System.out.println(kn1);

        kn1.sortAmmunitionByWeight();
        System.out.println(kn1);

        Knight kn2 = new Knight("Jack", 23, 55, 100, new ArrayList<>());
        shop.buy(kn2.getAmmunitions(), "Helm", "Sword", "Boots", "Armor");
        System.out.println(kn2.findAmmunutionByPrice(20, 40));
        System.out.println(kn2);

    }
}
