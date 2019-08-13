package level02.lesson08;
/*
Минимум двух чисел
*/

/*Написать функцию, которая возвращает минимум из двух чисел.*/
public class Task4 {
    public static int min(int a, int b) {
        //напишите тут ваш код
        int minimum;
        if (a < b)
            minimum = a;
        else minimum = b;
        return minimum;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
