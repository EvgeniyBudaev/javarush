package level04.lesson06;
/*
18+
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".*/
public class Task5 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age < 18)
            System.out.println("Подрасти еще");
    }
}
