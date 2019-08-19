package level06.lesson11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Исправляем ошибки юности
*/
/*Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "The max is 25".*/
public class Task8 {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max = a > b ? a : b;

        System.out.println(text + Task8.max);
    }
}
