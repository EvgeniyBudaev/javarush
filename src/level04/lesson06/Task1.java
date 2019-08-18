package level04.lesson06;
/*
Минимум двух чисел
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.*/
public class Task1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a < b)
            System.out.println(a);
        else
            System.out.println(b);

    }
}
