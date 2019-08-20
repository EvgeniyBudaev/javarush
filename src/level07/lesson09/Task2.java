package level07.lesson09;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Слова в обратном порядке
*/
/*Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.*/
public class Task2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) { list.add(reader.readLine()); }   //добавляем в начало списка

        list.remove(2); //удаляем 3 элемент списка

        for (int i = list.size() - 1; i >= 0; i--) {          //Вывод результата на консоль в обратном порядке
            System.out.println(list.get(i));
        }
        //for(String s:Collections.reverse(list))System.out.println(s);
    }
}
