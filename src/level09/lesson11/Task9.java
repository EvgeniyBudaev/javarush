package level09.lesson11;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
Десять котов
*/
/*Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.*/
public class Task9 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }


    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<>();
        Cat cat1 = new Cat("one");
        Cat cat2 = new Cat("two");
        Cat cat3 = new Cat("three");
        Cat cat4 = new Cat("four");
        Cat cat5 = new Cat("five");
        Cat cat6 = new Cat("six");
        Cat cat7 = new Cat("seven");
        Cat cat8 = new Cat("eight");
        Cat cat9 = new Cat("nine");
        Cat cat10 = new Cat("ten");

        cats.put("1", cat1);
        cats.put("2", cat2);
        cats.put("3", cat3);
        cats.put("4", cat4);
        cats.put("5", cat5);
        cats.put("6", cat6);
        cats.put("7", cat7);
        cats.put("8", cat8);
        cats.put("9", cat9);
        cats.put("10", cat10);

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            String key = pair.getKey();
            Cat value = pair.getValue();
            set.add(value);
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

public static class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String toString() {
        return "Cat " + this.name;
    }
}
}
