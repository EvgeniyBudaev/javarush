package level06.lesson11;

import java.util.ArrayList;

/*
Статические коты
*/
/*1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.*/
public class Task2 {
    //напишите тут ваш код
    public static ArrayList<Task2> cats = new ArrayList<>();


    public Task2() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            cats.add(i, new Task2());
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Task2 cat : cats) {
            System.out.println(cat);
        }
    }
}
