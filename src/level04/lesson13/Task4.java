package level04.lesson13;
/*
Рисуем линии
*/
/*Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).*/
public class Task4 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for(int i = 1; i <= 10; i++){

            System.out.print(8);
        }
        System.out.println( );
        for(int i = 1; i <= 10; i++){

            System.out.println(8);
        }
    }
}
