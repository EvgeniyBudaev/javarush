package level08.lesson11;
/*
Модификатор запутался
*/
/*Переставь один модификатор static, чтобы пример скомпилировался.*/
public class Task7 {
    public static int A = 5;
    //public static int A = 5;
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}
