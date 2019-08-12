package level01.lesson07;
/*
Лишние строки нам не нужны
*/

/*Закомментируй те переменные, которые нигде не используются. Программа должна компилироваться.*/
public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c = b + 38;
        //int d = a + 12;
        //double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        //String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
    }
}

