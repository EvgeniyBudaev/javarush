package level07.lesson09;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Проверка на упорядоченность
*/
/*1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.*/
public class Task6 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 10; i++) { list.add(reader.readLine());}

        //String maxLength = list.get(0);
        for(int i = 0; i < 9; i++){
            if(list.get(i).length() < list.get(i + 1).length()){}
            else {System.out.println(i+1);}
        }
    }
}
