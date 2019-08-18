package level04.lesson13;
/*
Рисуем прямоугольник
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888*/
public class Task2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int i =1; i < m+1; i++)
        {
            for (int a=1; a < n +1;a++){
            System.out.print(8);
        }
            System.out.println();
        }
    }
}
