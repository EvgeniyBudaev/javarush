package level08.lesson11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Омовение Рамы
*/
/*Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.*/
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i-1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        string = new String(chars);
        System.out.println(string);
    }
}
