package level04.lesson04;
/*
День недели
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует*/
public class Task6 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number == 1)
            System.out.println("понедельник");
        else if (number == 2)
            System.out.println("вторник");
        else if (number == 3)
            System.out.println("среда");
        else if (number == 4)
            System.out.println("четверг");
        else if (number == 5)
            System.out.println("пятница");
        else if (number == 6)
            System.out.println("суббота");
        else if (number == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");

    }
}
