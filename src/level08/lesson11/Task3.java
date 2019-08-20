package level08.lesson11;
import java.util.HashMap;
import java.util.Map;
/*
Однофамильцы и тёзки
*/
/*1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.*/
public class Task3 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();

        map.put("Вершанский", "Дмитрий");
        map.put("Вершанский", "Сергей");
        map.put("Кочеткова", "Мария");
        map.put("Кочеткова", "Света");
        map.put("Веременко", "Дмитрий");
        map.put("Свидерский", "Сергей");
        map.put("Глухарёва", "Ольга");
        map.put("Ежков", "Никита");
        map.put("Рябов", "Сергей");
        map.put("Денисов", "Иван");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
