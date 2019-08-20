package level07.lesson12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Это конец
*/
/*Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.*/
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            list.add(reader.readLine());
            if (list.get(list.size() - 1).equals("end")) {
                list.remove(list.size() - 1);
                break;
            }
        }
        //напишите тут ваш код
        for (String x : list) {
            System.out.println(x);
        }
    }
}