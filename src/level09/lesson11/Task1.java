package level09.lesson11;
/*
Деление на ноль
*/
/*Создай метод public static void divideByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divideByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()*/
public class Task1 {
    public static void main(String[] args) {
        try {
            divideByZero();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void divideByZero(){
        int i = 5 / 0;
        System.out.println(i);
    }
}
