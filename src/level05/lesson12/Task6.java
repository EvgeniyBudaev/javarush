package level05.lesson12;
import java.io.*;
/*
Шеф, что-то не пашет
*/
/*Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.*/
public class Task6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
