package level03.lesson08;
import java.io.*;
import java.util.*;
/*
План по захвату мира
*/

/*Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!*/
public class Task1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        System.out.println(name + " захватит мир через " + number + " лет. Му-ха-ха!");
    }
}
