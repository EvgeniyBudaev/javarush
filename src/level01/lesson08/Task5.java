package level01.lesson08;
/*
Число в квадрате
*/

/*Напиши программу, которая выводит на экран квадрат числа 5.*/
public class Task5 {
    public static void main(String[] args) {
        //напишите тут ваш код
        int result = sqr(5);
        System.out.println(result);
    }

    public static int sqr(int a) {
        return a * a;
    }
}
