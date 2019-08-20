package level08.lesson11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Пять победителей
*/
/*Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.*/
public class Task8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        // сортиурем массив
        Arrays.sort(array);
        // меняем местами элементы в массиве
        for(int i =0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 -i];
            array[array.length - 1 - i] = temp;
        }
    }
}
