package level08.lesson08;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
Нам повторы не нужны
*/
/*Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.*/
public class Task5 {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();

        map.put("Ежков", "Никита");
        map.put("Вершанский", "Дмитрий");
        map.put("Кочеткова", "Мария");
        map.put("Косотурова", "Мария");
        map.put("Веременко", "Дмитрий");
        map.put("Рябов", "Сергей");
        map.put("Денисов", "Иван");
        map.put("Семенов", "Дмитрий");
        map.put("Филатов", "Антон");
        map.put("Рыцев", "Сергей");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> temp = new HashMap<>(map);

        Iterator<Map.Entry<String, String>> it = temp.entrySet().iterator();

        while (it.hasNext()){

            Map.Entry<String, String> pair = it.next();

            for (Map.Entry<String, String> pair1 : temp.entrySet()) {
                if (pair.getValue().equals(pair1.getValue()) && !pair.getKey().equals(pair1.getKey())){
                    removeItemFromMapByValue(map, pair.getValue());
                }
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
