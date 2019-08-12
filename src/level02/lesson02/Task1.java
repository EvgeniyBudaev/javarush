package level02.lesson02;
/*
Прибавка к зарплате
*/

/*В методе public static void hackSalary(int a) увеличь зарплату на 100 и выведи на экран надпись: "Твоя зарплата составляет: <a+100> долларов в месяц."
Где <a+100> - это зарплата увеличенная на 100.

Пример вывода на экран для а = 700:
Твоя зарплата составляет: 800 долларов в месяц.*/
public class Task1 {
    public static void main(String[] args) {
        hackSalary(700);
    }

    public static void hackSalary(int a) {
        // напишите тут ваш код
        System.out.println("Твоя зарплата составляет: " + (a+100) + " долларов в месяц.");
    }
}
