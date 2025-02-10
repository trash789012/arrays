package main.java.ru.sibintek.arraysDemonstration.properties;

public class IndexAccessDemo {
    public static void main(String[] args) {
        Integer[] mandate = { 100, 120, 200 };

        int devMandate = mandate[0];
        System.out.println(devMandate);

        int devTestMandate = mandate[1];
        System.out.println(devTestMandate);

//        int count = mandate.length;
        int count = mandate.length - 1;
        int lastMandate = mandate[count];
        System.out.println(lastMandate);
    }
}
