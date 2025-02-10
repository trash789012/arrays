package main.java.ru.sibintek.arraysDemonstration.utils;

import java.util.Arrays;

public class PassByReferenceDemo {
    public static void main(String[] args) {

        //Инициализируем массив
        String[] fruits = {"Apple", "Banana", "Orange", "Grape", "Pineapple"};
        //После вызова метода будет изменен массив (последний элемент)
        replaceNameOfFruits(fruits);
        System.out.println(Arrays.toString(fruits));

    }

    public static void replaceNameOfFruits(String[] fruitsCopy) {
        fruitsCopy[fruitsCopy.length - 1] = "Kiwi";
    }
}
