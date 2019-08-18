package level04.lesson07;
/*
Положительное число
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.*/
public class Task3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int b = 0;
        try {
            b = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int c = 0;
        try {
            c = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int d =0,e=0;
        if (a > 0)
            d++;
        else
            e++;
        if (b > 0)
            d++;
        else
            e++;
        if (c > 0)
            d++;
        else
            e++;
        //System.out.println("количество отрицательных чисел: " + e);
        System.out.println("количество положительных чисел: " + d);
    }
}
