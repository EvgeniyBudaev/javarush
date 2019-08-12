package level01.lesson08;
/*
Просто, как 2+2
*/

/*Напиши программу, которая вызывает метод sum с параметрами 2 и 2.*/
public class Task6 {
    public static void main(String[] args) {
        //напишите тут ваш код
        sum(2,2);
    }

    public static void sum(int a, int b) {
        int c = a + b;
        System.out.print(c);
    }
}
