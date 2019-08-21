package level10.lesson11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Количество букв
*/
/*Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9*/
public class Task5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < 33; i++){
            res.add(0);
        }

        for (String s : list){
            char[] stringArray = s.toCharArray();
            for (char c : stringArray){
                int index = alphabet.indexOf(c);
                if (index != - 1){
                    int count = res.get(index);
                    res.remove(index);
                    res.add(index, ++count);
                }
            }
        }

        for (int i = 0; i < res.size(); i++){
            char letter = alphabet.get(i);
            int countResult = res.get(i);
            System.out.println(letter + " " + countResult);
        }
    }
}
