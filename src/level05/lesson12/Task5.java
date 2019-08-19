package level05.lesson12;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Консоль-копилка
*/
/*Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.*/
public class Task5 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int summa = 0;
        String i;

        while (4>1)
        {
            i = reader.readLine();
            if (i.equals("сумма"))
                break;
            a = Integer.parseInt(i);
            summa = summa +a;
        }
        System.out.println(summa);
    }
}
