package level08.lesson08;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
Больше 10? Вы нам не подходите
 */
/*Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.*/
public class Task2 {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(15);
        set.add(13);
        set.add(111);
        set.add(132);
        set.add(142);
        set.add(122);
        set.add(102);
        set.add(192);
        set.add(172);
        set.add(22);
        set.add(3132);
        set.add(1132);
        set.add(5132);
        set.add(13332);
        set.add(11132);
        set.add(12232);

        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer text = iterator.next();
            if (text > 10) {
                iterator.remove();
            }
        }
        return set;

    }

    public static void main(String[] args) {

    }
}
