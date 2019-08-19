package level06.lesson11;
/*
Кот и статика
*/

/*В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount
величивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.*/
public class Task1 {
    public static void main(String[] args) {
        // Создай 10 котов
        for(int i = 0; i < 10; i++){
            new Cat();
        }

        // Выведи значение переменной catCount
        System.out.println(Cat.catCount);

    }

    public static class Cat {
        // Создай статическую переменную catCount
        static int catCount;


        // Создай конструктор
        public Cat(){
            Cat.catCount++;
        }
    }
}
