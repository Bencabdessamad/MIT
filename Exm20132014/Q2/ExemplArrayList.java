package Exm20132014.Q2;

import java.util.ArrayList;

public class ExemplArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Grape");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println(fruits.size());
        fruits.remove("Pear");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println(fruits.size());
    }
}
