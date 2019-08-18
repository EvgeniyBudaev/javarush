package level04.lesson06;
/*
Фейс-контроль
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".*/
public class Task6 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age > 20)
            System.out.println("И 18-ти достаточно");
    }
}

