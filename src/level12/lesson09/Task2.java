package level12.lesson09;
/*
Лететь, бежать и плыть
*/
/*Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
Добавить в каждый интерфейс по одному методу.*/
public class Task2 {
    public static void main(String[] args) {

    }

//add interfaces here - добавь интерфейсы тут
public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }
}
