package level05.lesson09;
/*
Максимум конструкторов
*/
/*Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.

Подсказка:
не забудь про конструктор по умолчанию.*/
public class Task7 {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код

    public Task7(){

    }

    public Task7(double x){
        this.x = x;
    }

    public Task7(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Task7(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}
