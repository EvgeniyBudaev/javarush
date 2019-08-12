package level02.lesson05;
/*
Самое нужное число
*/

/*Закомментируй максимальное количество строк, чтобы на экран вывелось число 19*/
public class Task1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        y = y + 3 * x;
        //x = x * 2; 2
        x = x * 16;
        //y = y + 2 * x; 2
        y = y + x;

        System.out.println(y);
    }
}
