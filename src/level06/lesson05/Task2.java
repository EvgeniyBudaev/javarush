package level06.lesson05;
/*
Пустые кошки, пустые псы
*/
/*В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.*/
public class Task2 {
    public static void main(String[] args) {

    }

    //напишите тут ваш код
    protected void finalize() throws Throwable {
        System.out.println("Cat was destroyed");
    }

}

class Dog {
    //напишите тут ваш код
    protected void finalize() throws Throwable {
        System.out.println("Dog was destroyed");
    }
}
