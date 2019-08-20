package level07.lesson06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Самые-самые
*/
/*1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.*/
public class Task6 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String string : strings) {
            if (string.length() < min) {
                min = string.length();
            }
            else if (string.length() > max) {
                max = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == min) {
                System.out.println(string);
                break;
            }
            if (string.length() == max) {
                System.out.println(string);
                break;
            }
        }
    }
}
