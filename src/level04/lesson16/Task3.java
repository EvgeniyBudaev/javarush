package level04.lesson16;
/*
Суммирование
*/
import java.io.*;
import java.util.*;
/*Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.*/
public class Task3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int summa =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        while (true)
        {
            a = Integer.parseInt(reader.readLine());
            summa = summa + a;
            int exit = -1;
            if (a==exit)
                break;
        }
        System.out.println(summa);
    }
}
