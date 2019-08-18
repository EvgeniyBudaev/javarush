package level03.lesson06;
/*
Таблица умножения
*/

/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...*/
public class Task2 {
    public static void main(String[] args)
    {
        //напишите тут ваш код
        for (int i=1; i <=10;i++) {

            for (int n=1; n <= 10; n++) {

                System.out.print(i * n + " ");
            }
            System.out.println();
        }

    }
}
