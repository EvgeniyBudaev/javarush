package level08.lesson03;

import java.util.HashSet;

/*
Set из растений
*/
/*Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё 10 строк:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.*/
public class Task1 {
    public static void main(String[] args) {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        for (String text : set) {
            System.out.println(text);
        }

    }
}
