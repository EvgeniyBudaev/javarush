package level02.lesson01;
/*
Реализуем метод print
*/

/*В методе print выведи на экран переданную строку 4 раза. Каждый раз с новой строки.*/
public class Task1 {
    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java opens many opportunities!");
    }

    public static void print(String s) {
        //напишите тут ваш код
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
