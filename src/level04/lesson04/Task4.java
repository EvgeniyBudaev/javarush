package level04.lesson04;
/*
Времена года на Терре
*/

/*Напишите метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна*/
public class Task4 {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if ((month==12) || (month < 3))
            System.out.println("зима");
        if ((month > 2) &&(month < 6))
            System.out.println("весна");
        if ((month > 5) &&(month < 9))
            System.out.println("лето");
        if ((month > 8 ) &&(month < 12))
            System.out.println("осень");

    }
}
