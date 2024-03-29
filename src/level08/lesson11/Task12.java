package level08.lesson11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Задача по алгоритмам
*/
/*Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.*/
public class Task12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19; j++) {
                if (isGreaterThan(array[j], array[j + 1])) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
