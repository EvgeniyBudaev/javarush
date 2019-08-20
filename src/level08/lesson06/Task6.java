package level08.lesson06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Cамая длинная последовательность
*/
/*1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3*/
public class Task6 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        int number = list.get(0);
        int count = 1;
        int countFinale = 1;
        for(int i = 1; i < list.size(); i++){
            if(number == list.get(i)){
                count++;
                number = list.get(i);
            }
            else {
                number = list.get(i);
                if(countFinale < count){countFinale = count;}
                count = 1;
            }
        }
        if(countFinale < count){countFinale = count;}
        System.out.println(countFinale);

    }
}
