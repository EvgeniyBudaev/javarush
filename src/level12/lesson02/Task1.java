package level12.lesson02;
/*
Киты и коровы
*/
/*Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:

Я не корова, Я - кит.*/
public class Task1 {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "Я не корова, Я - кит.";
        }
    }
}
