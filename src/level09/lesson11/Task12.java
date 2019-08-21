package level09.lesson11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Задача по алгоритмам
*/
/*Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.*/
public class Task12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        ArrayList<Integer> arrayListNumbers = new ArrayList();
        ArrayList<String> arrayListLetters=new ArrayList<>();

        for(int i=0;i<array.length;i++){
            if(isNumber(array[i])){
                arrayListNumbers.add(Integer.parseInt(array[i]));
            }
            else {
                arrayListLetters.add(array[i]);
            }
        }
        Collections.sort(arrayListNumbers,Collections.reverseOrder());
        for (int i = 0; i < arrayListLetters.size(); i++ ){
            String s1;
            for (int j = arrayListLetters.size() -1; j > i; j--) {
                if (isGreaterThan(arrayListLetters.get(j - 1), arrayListLetters.get(j))) {
                    s1 = arrayListLetters.get(j - 1);
                    arrayListLetters.set(j - 1, arrayListLetters.get(j));
                    arrayListLetters.set(j, s1);
                }
            }
        }

        ArrayList list = new ArrayList();
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < array.length; i++){
            if (isNumber(array[i])) {
                list.add(arrayListNumbers.get(count1));
                count1++;
            }
            else {
                list.add(arrayListLetters.get(count2));
                count2++;
            }
        }
        list.trimToSize();
        for(int i = 0; i < array.length; i++){
            array[i] = String.valueOf(list.get(i));
        }

    }
    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {

        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
