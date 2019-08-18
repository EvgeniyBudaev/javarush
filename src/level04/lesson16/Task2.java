package level04.lesson16;
/*
Как-то средненько
*/
import java.io.*;
import java.util.*;
/*Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.*/
public class Task2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a<b && a>c || a>b && a<c){
            prnt(a);
        } else if (b<a && b>c || b>a && b<c){
            prnt(b);
        } else if (c<a && c>b || c>a && c<b){
            prnt(c);
        }
    }
    public static void prnt(int arg){
        System.out.print(arg);
    }
}
