package level05.lesson12;
import java.io.*;
/*
Задача по алгоритмам
*/
/*Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.*/
public class Task8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int N = 0;

        //напишите тут ваш код
        maximum = Integer.parseInt(reader.readLine());
        for (int i =0; i < N-1; i++ )
        {
            N = Integer.parseInt(reader.readLine());
            if (N > maximum )
                maximum = N;
        }

        System.out.println(maximum);
    }
}
