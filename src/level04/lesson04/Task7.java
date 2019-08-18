package level04.lesson04;
/*
Количество дней в году
*/
import java.io.*;
import java.util.*;

/*Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
количество дней в году: x
, где
х - 366 для високосного года,
х - 365 для обычного года.*/
public class Task7 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int a = 0;
        if ((x % 4)== 0)
        {
            a = 1;
            if(((x % 100)==0) &&(x % 400) != 0)
                a = 0;
            if (a == 1)
                System.out.println("количество дней в году: 366");

        }
        if (a != 1)
            System.out.println("количество дней в году: 365");

    }
}
