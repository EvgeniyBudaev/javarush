package level02.lesson08;
/*
Минимум трёх чисел
*/

/*Написать функцию, которая вычисляет минимум из трёх чисел.

Подсказка:
Нужно написать тело существующей функции min.*/
public class Task5 {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int minimum;
        if (a <= b && a <= c)
            minimum = a;
        else if (b <= a && b <= c)
            minimum = b;
        else
            minimum = c;
        return minimum;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
