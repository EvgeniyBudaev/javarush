package level09.lesson11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Гласные и согласные
*/
/*Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .*/
public class Task5 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        read = read.replaceAll(" ", "");
        char[] charArray = read.toCharArray();
        ArrayList vovel = new ArrayList();
        ArrayList notVovel = new ArrayList();

        for (int i =0; i < charArray.length; i++){
            if (isVowel(charArray[i])) {
                vovel.add(charArray[i]);
            }
            else {
                notVovel.add(charArray[i]);
            }
        }
        for (int i = 0; i < vovel.size(); i++){
            System.out.print(vovel.get(i) + " ");
        }
        System.out.println("");
        for (int i = 0; i < notVovel.size(); i++){
            System.out.print(notVovel.get(i) + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
