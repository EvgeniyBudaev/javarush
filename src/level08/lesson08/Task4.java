package level08.lesson08;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/*
Добрая Зинаида и летние каникулы
*/
/*Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.*/
public class Task4 {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Obama", new Date("JULY 10 1981"));
        map.put("Willis", new Date("APRIL 21 1978"));
        map.put("Reygan", new Date("MARCH 12 1992"));
        map.put("Stalin", new Date("AUGUST 10 1982"));
        map.put("Molotov", new Date("JANUARY 1 1980"));
        map.put("Pushkin", new Date("JANUARY 7 1996"));
        map.put("Lermontov", new Date("JUNE 25 1988"));
        map.put("Shevchenko", new Date("JUNE 1 1980"));
        map.put("Ivanov", new Date("MARCH 11 2000"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Date> temp = iterator.next();
            int x = temp.getValue().getMonth();
            if (x == 5 || x == 6 || x == 7){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
