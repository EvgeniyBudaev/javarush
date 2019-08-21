package level09.lesson02;
/*
И снова StackTrace
*/
/*Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.*/
public class Task2 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        String s = traceElements[2].getMethodName().toString();
        return s;
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        String s = elements[2].getMethodName().toString();
        return s;
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        String s = element[2].getMethodName().toString();
        return s;
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        String s = elements[2].getMethodName().toString();
        return s;
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        String s = elements[2].getMethodName().toString();
        return s;
    }
}
