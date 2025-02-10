package main.java.ru.sibintek.arraysDemonstration.declare;

public class DeclareDemo {
    public static void main(String[] args) {
        //Объявление массива, память еще не выделена
        int[] numbers; //Массив целых чисел
        String[] names; //Массив строк
        double[] prices; //Массив дробных чисел

        //Выделение памяти в куче (Heap Memory)
        numbers = new int[5]; //Выделится 4 * 5 = 20 байт памяти
        names = new String[5];
        prices = new double[5];

        //Присвоение значений элементам массива
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // numbers содержит ссылку на блок памяти на куче, где хранятся числа.
        // Когда numbers выйдет из области видимости, сборщик мусора освободит память.
    }
}
