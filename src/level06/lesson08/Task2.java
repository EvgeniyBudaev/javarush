package level06.lesson08;
/*
Статические методы для кошек
*/
/*Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).*/
public class Task2 {
    private static int catCount = 0;

    public Task2() {
        catCount++;
    }

    public static int getCatCount() {
        //напишите тут ваш код
        return catCount;

    }

    public static void setCatCount(int catCount) {
        //напишите тут ваш код
        Task2.catCount = catCount;

    }

    public static void main(String[] args) {

    }
}
