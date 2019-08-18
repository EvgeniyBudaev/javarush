package level04.lesson04;
/*
Положительное и отрицательное число
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.*/
public class Task5 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number > 0)
            System.out.println(number*2);

        else if (number == 0)
            System.out.println(0);

        else if (number < 0)
            System.out.println(number + 1);
    }
}
