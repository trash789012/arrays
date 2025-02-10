package main.java.ru.sibintek.arraysDemonstration.declare;

import java.util.Arrays;

public class MultiArraysDemo {
    public static void main(String[] args) {
        int[][] chessTwoDimensionalArray = new int[8][8]; //64 element

        //Инициализация по индексу
        chessTwoDimensionalArray[0][0] = 1;
        chessTwoDimensionalArray[0][1] = 2;
        chessTwoDimensionalArray[1][0] = 3;
        chessTwoDimensionalArray[1][1] = 4;
        chessTwoDimensionalArray[7][7] = 5;

        //Инициализация при объявлении
        int[][] chessTwoDimensionalArray2 = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        System.out.println(Arrays.deepToString(chessTwoDimensionalArray2));
    }
}
