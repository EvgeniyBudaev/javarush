package level03.lesson12;
import java.io.*;
import java.util.*;
/*
Финансовые ожидания
*/

/*Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час*/
public class Task3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        System.out.println("Я буду зарабатывать $" + num + " в час");
    }
}
