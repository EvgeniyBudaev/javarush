package level07.lesson06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Выражаемся покороче
*/
/*1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.*/
public class Task3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int min = Integer.MAX_VALUE;
        for (String string : strings) {
            if (string.length() < min) {
                min = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == min) {
                System.out.println(string);
            }
        }
    }
}
