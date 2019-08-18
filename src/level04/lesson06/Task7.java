package level04.lesson06;
/*
Три числа
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3*/
public class Task7 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a==b)
            System.out.println(c);
        else
        {
            if (a==c)
                System.out.println(b);
            else
                System.out.println(a);
        }
    }
}
