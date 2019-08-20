package level08.lesson08;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
Только для богачей
*/
/*Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.*/
public class Task6 {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> notes = new HashMap<String, Integer>();
        notes.put("Сидоров", 1000);
        notes.put("Петров", 700);
        notes.put("Кузнецов", 3000);
        notes.put("Иванов", 200);
        notes.put("Жиглов", 270);
        notes.put("Шарапов", 1000);
        notes.put("Хлебнико", 50);
        notes.put("Шмит", 499);
        notes.put("Пушкин", 600);
        notes.put("Никитина", 1200);

        return notes;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> salary = map.entrySet().iterator();

        while (salary.hasNext()) {
            Map.Entry<String, Integer> entry = salary.next();
            if (entry.getValue() < 500) {
                salary.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
