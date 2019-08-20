package level08.lesson08;
import java.util.HashSet;
import java.util.Set;
/*
20 слов на букву «Л»
*/
/*Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".*/
public class Task1 {
    public static Set<String> createSet() {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        set.add("Л");
        set.add("Ла");
        set.add("Лаа");
        set.add("Лааa");
        set.add("Лааaa");
        set.add("Лааaaa");
        set.add("Лаaaaaа");
        set.add("Лаaaaaaа");
        set.add("Лаaaaaaaа");
        set.add("Лаaaaaaaаa");
        set.add("Лаaaaaaaаaa");
        set.add("Лаaaaaaaаaaa");
        set.add("Лаaaaaaaаaaaa");
        set.add("Лаaaaaaaаaaaaa");
        set.add("Лаaaaaaaаaaaaaa");
        set.add("Лaaaaaaaаaaaaaaа");
        set.add("Лаaaaaaaaaaaaaaaа");
        set.add("Лаaaaaaaaaaaaaaaаa");
        set.add("Лаaaaaaaaaaaaaaaaaа");
        set.add("Лаaaaaaaaaaaaaaaaaaа");

        return set;

    }

    public static void main(String[] args) {

    }
}
