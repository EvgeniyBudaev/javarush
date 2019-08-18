package level04.lesson06;
/*
Максимум четырех чисел
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.*/
public class Task2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());

        if ((num1 > num2) && (num1 > num3)  && (num1>num4))
            System.out.println(num1);
        else if ((num2>num3) && (num2>num4))
        {
            System.out.println(num2);
        }
        else if (num3>num4)
        {
            System.out.println(num3);
        }
        else
        {
            System.out.println(num4);
        }
    }
}
