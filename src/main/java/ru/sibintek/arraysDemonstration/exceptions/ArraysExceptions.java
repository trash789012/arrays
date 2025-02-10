package main.java.ru.sibintek.arraysDemonstration.exceptions;

public class ArraysExceptions {
    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            array[10] = 10;
        } catch (ArrayIndexOutOfBoundsException e) { //runtime exception
            e.printStackTrace(System.out);
        }

    }
}
