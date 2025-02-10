package main.java.ru.sibintek.arraysDemonstration.objects;

import java.util.Arrays;

public class Cat implements Comparable<Cat>{

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Murka", 2);
        cats[1] = new Cat("Boris", 1);
        cats[2] = new Cat("Hamlet", 5);

        System.out.println(Arrays.toString(cats));

        CatAgeComparator comparator = new CatAgeComparator();

        System.out.println("\n" + "Cортировка котов");
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        System.out.println("\n" + "Сортировка котов через Comparator");
        Arrays.sort(cats, comparator);
        System.out.println(Arrays.toString(cats));


        System.out.println("\n" + "Поиск кота в массиве");
        main.java.ru.sibintek.arraysDemonstration.objects.Cat searchCat = new main.java.ru.sibintek.arraysDemonstration.objects.Cat("Boris", 2);
        int searchCatIndex = Arrays.binarySearch(cats, searchCat, comparator);
        System.out.println(searchCatIndex);

        System.out.println("\n" + "Копирование");
        Cat[] copyOfCats = Arrays.copyOf(cats, cats.length);
        System.out.println(Arrays.toString(copyOfCats));

        copyOfCats = Arrays.copyOfRange(cats, 1, 3);
        System.out.println(Arrays.toString(copyOfCats));

        System.out.println("\n" + "Сравнение котов");
        System.out.println(Arrays.equals(cats, copyOfCats));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Cat cat = (Cat) obj;

        return this.name.equals(cat.name) && this.age == cat.age;
    }

    @Override
    public int hashCode() {
        int result = 1;

        result = 31 * result + name.hashCode();
        result = 31 * result + age;

        return result;

//         return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return this.getAge() - o.getAge();
    }
}