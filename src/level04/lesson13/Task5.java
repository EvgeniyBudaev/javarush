package level04.lesson13;
/*
Письмо счастья
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.*/
public class Task5 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for (int i=0; i <10; i++){
                System.out.println(name + " любит меня.");
        }
    }
}
