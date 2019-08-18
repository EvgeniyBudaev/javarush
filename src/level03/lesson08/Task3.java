package level03.lesson08;
/*
Скромность украшает программиста
*/
import java.io.*;
import java.util.*;

/*Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!

Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!*/
public class Task3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");

    }
}
