package level03.lesson03;
/*
Обмен валют
*/

/*Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
Для возврата результата из метода convertEurToUsd используй оператор return. Пример: return 123*435;
Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс*/
public class Task2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(75, 0.88));
        System.out.println(convertEurToUsd(70, 0.88));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double usd = eur * course;
        return (usd);
    }
}
