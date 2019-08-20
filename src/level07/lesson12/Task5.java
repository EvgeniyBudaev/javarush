package level07.lesson12;
/*
Обратный отсчёт
*/
/*Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст "Бум!".
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.*/
public class Task5 {
    public static void main(String[] args) throws  Exception{
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}
