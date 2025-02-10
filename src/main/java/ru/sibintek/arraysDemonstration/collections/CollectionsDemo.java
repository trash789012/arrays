package main.java.ru.sibintek.arraysDemonstration.collections;

import java.util.ArrayList;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Boris");
        names.add("Vera"); //Размер автоматически увеличивается

        System.out.println(names.size()); //размерность коллекции
        System.out.println(names); //вывод в консоль

        names.remove(1); //удаление по индексу
        System.out.println(names);

        names.remove("Anna"); //удаление по значению
        System.out.println(names);

        int index = names.indexOf("Vera");
        System.out.println(index); //индекс элемента

        boolean exists = names.contains("Vera"); //проверка на наличие
        System.out.println(exists);
    }
}
