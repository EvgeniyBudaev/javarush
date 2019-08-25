package level12.lesson06;
/*
Корова — тоже животное
*/
/*Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow.*/
public class Task4 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName() {
            return "Я корова";
        }
    }
}
