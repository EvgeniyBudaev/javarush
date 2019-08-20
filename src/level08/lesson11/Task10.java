package level08.lesson11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.*;

/*
Номер месяца
*/
/*Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.*/
public class Task10 {
    public static void main(String[] args) throws IOException {

        Map<String, Integer> monthMap = new HashMap<>();

        String month = null;
        for (int num = 0; num < 12; num++) {
            DateFormatSymbols dfs = new DateFormatSymbols(Locale.ENGLISH);
            String[] months = dfs.getMonths();
            if (num >= 0 && num <= 11) {
                month = months[num];
                // System.out.println(month);
                monthMap.put(month, num + 1);
            }
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sMonth = reader.readLine();
//      System.out.println(sMonth);
        reader.close();

        System.out.printf("%s is the %d month\n", sMonth, monthMap.get(sMonth));

    }
}
