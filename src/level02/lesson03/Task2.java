package level02.lesson03;
/*
Макс, Белла и Джек
*/
/*Создать 3 объекта типа Dog (собака).
Сохрани каждый экземпляр в отдельную переменную.
Присвоить им имена "Max", "Bella", "Jack".*/
public class Task2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";

        //напишите тут ваш код
        Dog dog2 = new Dog();
        dog2.name = "Bella";

        Dog dog3 = new Dog();
        dog3.name = "Jack";
    }

    public static class Dog {
        public String name;
    }
}
