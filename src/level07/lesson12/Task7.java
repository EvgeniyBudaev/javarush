package level07.lesson12;
/*
Переставь один модификатор static
*/
/*Переставь один модификатор static, чтобы пример скомпилировался.*/
public class Task7 {
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
    }

    public  int getValue() {
        return C;
    }
}
