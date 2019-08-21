package level10.lesson11;
/*
Расставьте минимум static-ов
*/
/*Расставьте как можно меньше модификаторов static так, чтобы пример скомпилировался.*/
public class Task7 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Task7 solution = new Task7();
        solution.A = 5;
        Task7.B = 5 * B;
        Task7.C = 5 * C * D;
        Task7.D = 5 * D * C;
        Task7.D = 5;
    }

    public int getA() {
        return A;
    }
}
