package level09.lesson06;
/*
Исключение при работе с числами
*/
/*Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int num=Integer.parseInt("XYZ");
System.out.println(num);*/
public class Task6 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }

        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
    }
}
