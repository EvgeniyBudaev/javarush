package level03.lesson05;
/*
Печатаем строки
*/

/*Реализуй метод public static void writeToConsole(String s), который добавляет к началу строки выражение "printing: " и выводит измененную строку на экран.

Пример вывода для "Hello world!":
printing: Hello world!*/
public class Task2 {
    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s) {
        //напишите тут ваш код
        System.out.println("printing: " + s);
    }
}