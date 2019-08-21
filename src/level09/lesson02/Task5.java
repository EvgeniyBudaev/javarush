package level09.lesson02;
/*
Там, в синих глубинах стек-трейса…
*/
/*Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.*/
public class Task5 {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        int number = 0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement elements : stackTraceElements){
            number++;
        }
        System.out.println(number);
        return number;
    }
}
