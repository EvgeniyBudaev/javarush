package level08.lesson06;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/*
Время для 10 тысяч вызовов get
*/
/*Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.*/
public class Task4 {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // напишите тут ваш код
        Date dateAfter = new Date();

        get10000(list);

        // напишите тут ваш код
        Date dateBefore = new Date();
        return dateBefore.getTime() -dateAfter.getTime();

    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
