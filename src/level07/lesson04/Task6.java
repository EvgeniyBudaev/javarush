package level07.lesson04;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Улицы и дома
*/
/*1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."*/
public class Task6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        for (int i = 0; i < list.length; i++)
        {
            if (i%2 == 0)
            {
                sum = sum + list[i];
            }
            else sum2 = sum2 + list[i];
        }
        if (sum > sum2)
        {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
