package level10.lesson11;
/*
Правильный ответ: d = 5.5
*/
/*Добавить одну операцию по преобразованию типа, чтобы получался ответ: d = 5.5*/
public class Task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / (double) e;
        System.out.println(d);
    }
}
