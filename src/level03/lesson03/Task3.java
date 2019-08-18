package level03.lesson03;
/*
Задача на проценты
*/

/*Напиши код метода addTenPercent, который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent используй оператор return.

Пример:
return 123 * 435;*/
public class Task3 {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        return (i * 1.1);
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
