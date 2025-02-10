package main.java.ru.sibintek.arraysDemonstration.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsSort {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Меркурий", "Венера", "Земля" , "Марс",
                "Юпитер", "Сатурн", "Уран", "Нептун" ));
        Collections.sort(planets);
        System.out.println(planets);
    }
}
