package level12.lesson06;
/*
Кошки не должны быть абстрактными!
*/
/*Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы.
Классы Cat и Dog не должны быть абстрактными.*/
public class Task5 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{
        public  String getName(){
            return "Я кошка";

        }

        public Pet getChild(){
            return new Cat();
        }

    }

    public static class Dog extends Pet{
        public  String getName(){
            return "Я собака";

        }

        public Pet getChild(){
            return new Dog();
        }

    }
}
