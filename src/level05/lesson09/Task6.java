package level05.lesson09;
/*
Вызов конструктора из конструктора
*/
/*Разберись, что делает программа.
Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор с радиусом 10.*/
public class Task6 {
    public double x;
    public double y;
    public double radius;

    public Task6(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Task6(double x, double y) {
        //напишите тут ваш код
        this(x, y, 10.0);
    }

    public Task6() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Task6 circle = new Task6();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Task6 anotherCircle = new Task6(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
