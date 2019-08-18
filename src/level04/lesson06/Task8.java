package level04.lesson06;
/*
Цель установлена!
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.*/
public class Task8 {
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
        if (a > 0)
        {
            if (b > 0)
                System.out.println(1);
            else
                System.out.println(4);
        }
        else
        {
            if (b > 0)
                System.out.println(2);
            else
                System.out.println(3);
        }
    }
}
