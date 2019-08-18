package level04.lesson06;
/*
Настя или Настя?
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.*/
public class Task4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else
        {
            if (name1.length()==name2.length())
                System.out.println("Длины имен равны");
        }
    }
}
