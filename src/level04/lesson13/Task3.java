package level04.lesson13;
/*
Треугольник из восьмерок
*/
/*Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.*/
public class Task3 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i=10; i >0; i--)
        {
            for (int a=i; a < 11;a++)
            {
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}
