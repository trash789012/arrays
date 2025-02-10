package main.java.ru.sibintek.arraysDemonstration.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMinMax {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(Collections.max(numbers)); //возвращает максимальное число
        System.out.println(Collections.min(numbers)); //возвращает минимальное число
    }
}
