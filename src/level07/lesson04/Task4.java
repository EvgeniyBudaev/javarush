package level07.lesson04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Переверни массив
*/
/*1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.*/
public class Task4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }

        for (int j = array.length - 1; j >= 0; j--) {
            System.out.println(array[j]);
        }
    }
}
