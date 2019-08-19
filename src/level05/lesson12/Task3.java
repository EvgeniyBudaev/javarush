package level05.lesson12;
/*
Том и Джерри
*/
/*Создай классы Dog, Cat, Mouse.
        Добавь по три поля в каждый класс, на твой выбор.
        Создай объекты для героев мультика Том и Джерри.
        Так много, как только вспомнишь.*/
public class Task3 {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Cat Tom = new Cat("Tom", 11 , 20);
        Dog dog1 = new Dog("Pes", 12 , 21);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Dog
    {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
