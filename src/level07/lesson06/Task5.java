package level07.lesson06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Удалить и вставить
*/
/*1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.*/
public class Task5 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < 13; i++) {
            String s = list.get(4);
            list.add(0, s);
            list.remove(5);
            //list.add(0, list.remove(4)); //Короткая запись
        }

        for(int i = 0; i < 5; i++){          //Вывод результата на консоль
            System.out.println(list.get(i));
        }
    }
}
