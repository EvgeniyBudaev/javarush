package level08.lesson11;
import java.util.Date;
/*
Работа с датой
*/
/*1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false*/
public class Task9 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date dat_new = new Date(date);
        Date start_year = new Date(date);
        start_year.setHours(0);
        start_year.setMinutes(0);
        start_year.setSeconds(0);
        start_year.setDate(1);
        start_year.setMonth(0);
        long d = dat_new.getTime() - start_year.getTime();
        long ms = 1000*60*60*24;
        int dayCount = (int)(d/ms);
        if (dayCount%2==0)
            return true;
        else
            return false;
    }
}
