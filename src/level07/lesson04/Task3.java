package level07.lesson04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Общение одиноких массивов
*/
/*1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с
текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.*/
public class Task3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] array_str = new String[10];
        int[] array_int = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i < array_str.length;i++)
        {
            array_str[i] = reader.readLine();
            array_int[i] = array_str[i].length();
        }
        for (int n=0; n < array_str.length;n++)
        {
            System.out.println(array_int[n]);
        }
    }

}
