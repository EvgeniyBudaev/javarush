package level10.lesson11;
/*
Правильный ответ: d = 1.0
*/
/*Добавить одну операцию по преобразованию типа, чтобы получался ответ: d = 1.0*/
public class Task3 {
    public static void main(String[] args) {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte)a + b / c / e;

        System.out.println(d);
    }
}
