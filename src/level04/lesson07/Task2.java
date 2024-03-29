package level04.lesson07;
/*
Описываем числа
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

Пример для числа 100:
четное трехзначное число

Пример для числа 51:
нечетное двузначное число*/
public class Task2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if ((a >=1) && (a <=999))
        {
            if (a%2 ==0)
            {
                if (a < 10)
                    System.out.println("четное однозначное число");
                if (a >9 && a <100)
                    System.out.println("четное двузначное число");
                if (a >99 && a <=999)
                    System.out.println("четное трехзначное число");
            }
            else
            {
                if (a < 10)
                    System.out.println("нечетное однозначное число");
                if (a >9 && a <100)
                    System.out.println("нечетное двузначное число");
                if (a >99 && a <=999)
                    System.out.println("нечетное трехзначное число");

            }
        }
    }
}
