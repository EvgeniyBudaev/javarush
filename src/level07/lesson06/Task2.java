package level07.lesson06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Самая длинная строка
*/
/*1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.*/
public class Task2 {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>(); //создали список строк
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            strings.add(0,s);
        }

        for(int i = 0; i < 5; i++){ //используя цикл
            if (strings.get(i).length() > strings.get(0).length()) {

                strings.set(0, strings.get(i));
            }
        }
        System.out.println(strings.get(0));
    }
}
