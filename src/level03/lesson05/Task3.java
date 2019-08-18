package level03.lesson05;
/*
Конвертируем время
*/

/*Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
        Вызови его дважды в методе main с любыми параметрами.
        Результаты выведи на экран, каждый раз с новой строки.*/
public class Task3 {
    //напишите тут ваш код
    public static int convertToSeconds(int hour){
        return hour*3600;
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));

    }
}
