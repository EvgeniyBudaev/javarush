package level04.lesson10;
/*
Хорошего много не бывает
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.*/
public class Task3 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        str = reader.readLine();
        int i = Integer.parseInt(reader.readLine());

        int n =0;
        while (n<i)         {
            System.out.println(str);
            n++;
        }
    }
}
