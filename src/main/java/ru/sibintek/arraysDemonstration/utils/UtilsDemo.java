package main.java.ru.sibintek.arraysDemonstration.utils;

import java.util.Arrays;

public class UtilsDemo {
    public static void main(String[] args) {
        int[] unsorted = new int[5];

        unsorted[0] = 2;
        unsorted[1] = 5;
        unsorted[2] = 100;
        unsorted[3] = 1;
        unsorted[4] = 6;

        System.out.println("Сортировка массива:");

        Arrays.sort(unsorted);

        for (int element: unsorted){
            System.out.println(element);
        }

        System.out.println("\n" + "Поиск элемента в массиве");

        int index = Arrays.binarySearch(unsorted, 5);
        System.out.println(index);

        index = Arrays.binarySearch(unsorted, 7);
        System.out.println(index);

        System.out.println("\n" + "Преобразование массива к строке");
        System.out.println(unsorted.toString());
        String unsortedToString = Arrays.toString(unsorted);
        System.out.println(unsortedToString);

        System.out.println("\n" + "Создание копии массива");

        int[] numbers = { 5, 1, 3, 90, 2, 6 };
        int[] copyOfNumbers = copyOfArray(numbers);
        System.out.println(Arrays.toString(copyOfNumbers));

        System.out.println("\n" + "Создание копии массива через Arrays");

        int[] copyOfNumbers2 = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(copyOfNumbers2));

        int[]  copyOfNumbers3 = Arrays.copyOf(numbers, 2);
        System.out.println(Arrays.toString(copyOfNumbers3));

        int[] copyOfRange = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println(Arrays.toString(copyOfRange));

        System.out.println("\n" + "Сравнение массивов");
        System.out.println(numbers == copyOfNumbers);
        System.out.println(numbers.equals(copyOfNumbers));
        System.out.println(Arrays.equals(numbers, copyOfNumbers));

        System.out.println("\n" + "Применение к двумерным массивам");
        int[][] twoDimNumbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] numbersCopy = Arrays.copyOf(twoDimNumbers, twoDimNumbers.length);

        System.out.println("Равны ли эти двумерные массивы между собой?");
        System.out.println(Arrays.deepEquals(twoDimNumbers, numbersCopy));
        System.out.println(Arrays.deepToString(numbersCopy));


        System.out.println("\n" + "Заполнение значением");
        int[] autoFillArray = new int[5];
        Arrays.fill(autoFillArray, 1);
        System.out.println(Arrays.toString(autoFillArray));
    }

    static int[] copyOfArray(int[] array){
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        return copy;
    }
}
