package level07.lesson04;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Массивный максимум
*/
/*1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива*/
public class Task1 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[3];
        for(int i = 0; i < array.length; i++){
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }

        }
        return max;
    }
}
