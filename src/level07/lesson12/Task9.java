package level07.lesson12;
/*
Меняем функциональность
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует
строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
 */
public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if((s.length ()%2)==0)
                s=s+" "+s;
            else
                s=s+" "+s+" "+s;
            listUpperCase.add(s.toUpperCase());
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }
    }
}
