package level09.lesson06;
/*
Исключение при работе с числами
*/
/*
/*Перехватить исключение, возникающее при выполнении кода:
int a = 42 / 0;
Вывести на экран тип перехваченного исключения.*/

public class Task1 {
    public static void main(String[] args) {
        //напишите тут ваш код

        try
        {
            int a = 42/0;
        }
        catch (ArithmeticException exc){
            System.out.println(exc);
        }

        //напишите тут ваш код
    }
}
