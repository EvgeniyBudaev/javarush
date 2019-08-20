package level08.lesson08;
import java.util.HashMap;
import java.util.Map;
/*
Перепись населения
*/
/*Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.*/
public class Task3 {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("s" + i, "n" + i);
        }
        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int fm = 0;
        for (String firstName : map.values()) {
            if (firstName.equals(name)) {
                fm++;
            }
        }
        return fm;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int fl = 0;//напишите тут ваш код
        for (String surname : map.keySet()) {
            if (surname.equals(lastName)) {
                fl++;
            }
        }
        return fl;

    }

    public static void main(String[] args) {

    }
}
