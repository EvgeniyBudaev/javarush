package level04.lesson04;
/*
Правило треугольника
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.*/
public class Task8 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if ((a < b +c) && (b < a +c) && (c < a+b))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}
