package level04.lesson10;
/*
Таблица умножения
*/
/*Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.*/
public class Task5 {
    public static void main(String[] args) {
        //напишите тут ваш код
        //напишите тут ваш код
        int a =1;
        int b = 1;
        while (a < 11)
        {
            while (b < 11)
            {
                System.out.print(a * b + " ");
                b++;
            }
            a++;
            b =1;
            System.out.println();
        }
    }
}
