package level03.lesson08;
/*
Предсказание на будущее
*/
import java.io.*;
import java.util.*;

/*Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.*/
public class Task2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
    }
}
