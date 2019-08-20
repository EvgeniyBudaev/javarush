package level08.lesson03;
import java.util.HashMap;
import java.util.Map;
/*
Вывести на экран список ключей
*/
/*Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.*/
public class Task4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //напишите тут ваш код
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
