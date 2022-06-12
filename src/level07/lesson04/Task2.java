package level07.lesson04;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Массив из строчек в обратном порядке
*/
/*1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/
public class Task2 {
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String[] array = new String[10];
        String encoding = System.getProperty("console.encoding", "utf-8");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in, encoding));
        for (int i=0; i < 8;i++)
        {
            array[i] = buffer.readLine();
        }
        for (int n=array.length-1;n >=0;n--)
        {
            System.out.println(array[n]);
        }

    }
}
