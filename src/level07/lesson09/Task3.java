package level07.lesson09;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Продолжаем мыть раму
*/
/*1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.*/
public class Task3 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>(); //создание списка, где все элементы должны быть типа String

        Collections.addAll(list, "мама", "именно", "мыла", "именно", "раму", "именно");
        for(String str:list){System.out.println(str);}
    }
}
