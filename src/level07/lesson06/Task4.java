package level07.lesson06;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
В начало списка
*/
/*1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.*/
public class Task4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(0, s);    //добавляем в начало списка
        }
        for (String str : list){     //улучшенный цикл for. Работает с массивами.
            System.out.println(str);
        }
//        for(int i = 0; i < 10; i++){
//            System.out.println(list.get(i));
//        }
    }
}
