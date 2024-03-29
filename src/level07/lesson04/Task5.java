package level07.lesson04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Один большой массив и два маленьких
*/
/*1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
public class Task5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int[] num1 = new int[10];
        int[] num2 = new int[10];

        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < list.length / 2; i++)
        {
            num1[i] = list[i];
            num2[i] = list[i + 10];
            System.out.println(num2[i]);
        }
    }
}
