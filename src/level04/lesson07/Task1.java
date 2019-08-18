package level04.lesson07;
/*
Ярлыки и числа
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
"отрицательное четное число" - если число отрицательное и четное,
"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
"положительное четное число" - если число положительное и четное,
"положительное нечетное число" - если число положительное и нечетное.

Пример для числа 100:
положительное четное число

Пример для числа -51:
отрицательное нечетное число*/
public class Task1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (a==0)
            System.out.println("нулевое число");
        else
        {
            if (a > 0)
            {
                if (a % 2 == 0)
                    System.out.println("положительное четное число");
                else
                    System.out.println("положительное нечетное число");
            } else
            {
                if (-a % 2 == 0)
                    System.out.println("отрицательное четное число");
                else
                    System.out.println("отрицательное нечетное число");
            }
        }

    }
}
