package level06.lesson11;
/*
Феншуй и статики
*/
/*Переставь один модификатор static, чтобы пример скомпилировался.*/
public class Task3 {
    public static int A = 5;
    public int B = 2;
    public int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}
