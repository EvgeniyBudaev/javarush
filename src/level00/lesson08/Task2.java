package level00.lesson08;

/*
Комментарии излишни
*/

/*Раскомментируй одну строчку, чтобы программа вывела на экран числа 12 и 2 (сначала 12, а затем 2).*/

public class Task2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
