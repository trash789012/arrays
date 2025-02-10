package main.java.ru.sibintek.arraysDemonstration.output;

public class WriteToConsoleDemo {
    public static void main(String[] args) {
        String[] systemsSAP = { "RDD", "RND", "MGD", "TB0", "RNB" };

        //Цикл for, позволяет менять элементы массива
        for (int i = 0; i < systemsSAP.length; i++) {
            System.out.println(systemsSAP[i]);
        }

        System.out.println("------------");

        //Цикл for-each (только для чтения)
        for (String s: systemsSAP){
            System.out.println(s);
        }
    }
}
