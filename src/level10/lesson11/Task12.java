package level10.lesson11;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
/*
Функциональности маловато!
*/
/*Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.
Каждую пару с новой строки.*/
public class Task12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        /*int id = Integer.parseInt(reader.readLine());
        String name = reader.readLine();
        System.out.println("Id=" + id + " Name=" + name);*/

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true){
            String id = reader.readLine();
            if (id.isEmpty()){
                break;
            }
            String name = reader.readLine();
            map.put(name, Integer.parseInt(id));
        }
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
