package level09.lesson06;
/*
Исключение при работе со строками
*/
/*Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();*/
public class Task2 {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        //напишите тут ваш код
    }
}
