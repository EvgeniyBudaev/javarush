package level12.lesson06;
/*
«Исправь код», часть 1
*/
/*Исправь код, чтобы программа компилировалась.

Подсказка:
метод getChild должен остаться абстрактным.

*/
public class Task2 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
