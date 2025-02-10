package main.java.ru.sibintek.arraysDemonstration.output;

public class MultiArraysWriteToConsoleDemo {

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        //Для доступа можно использовать вложенненые циклы
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        System.out.println("------------");

        //Через for-each (только для чтения)
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.println(element);
            }
        }
    }


}
