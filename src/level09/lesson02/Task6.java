package level09.lesson02;
/*
Логирование стек-трейса
*/
/*Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

Пример вывода:
com.javarush.task.task09.task0906.Solution: main: In main method*/
public class Task6 {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName()+": "+Thread.currentThread().getStackTrace()[2].getMethodName()+": "+s);//напишите тут ваш код
    }
}
