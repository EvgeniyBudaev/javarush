package level04.lesson16;
/*
Как назвали, так назвали
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"*/
public class Task4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int y = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Меня зовут " + name+".");
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
