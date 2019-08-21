package level09.lesson11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Метод в try..catch
*/
/*Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.*/
public class Task3 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        while (true){

            try {
                int x = Integer.parseInt(reader.readLine());
                list.add(x);
            }

            catch (Exception e){
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));

                }
                break;
            }
        }
    }
}
