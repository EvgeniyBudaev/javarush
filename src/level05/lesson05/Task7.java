package level05.lesson05;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Среднее арифметическое
*/
/*Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.*/
public class Task7 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        while (true){

            int x = Integer.parseInt(reader.readLine());

            if (x != -1){
                list.add(x);
            }else break;
        }

        double result = 0;

        for (int i = 0; i < list.size(); i++) {
            result = result + list.get(i);
        }

        System.out.println(result / list.size());
    }
}
