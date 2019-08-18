package level04.lesson13;
/*
Четные числа
*/
/*Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Каждое значение вывести с новой строки.*/
public class Task1 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i=1; i < 101;i++)
        {
            if (i%2==0)
                System.out.println(i);
        }
    }
}
