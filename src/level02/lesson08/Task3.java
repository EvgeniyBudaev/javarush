package level02.lesson08;
/*
Печатаем трижды
*/

/*Реализуй метод print3. Метод должен вывести переданную строку (слово) на экран три раза через пробел.*/
public class Task3 {
    public static void print3(String s) {
        //напишите тут ваш код
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
