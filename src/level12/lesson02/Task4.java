package level12.lesson02;
/*
То ли птица, то ли лампа
*/

/*Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.*/
public class Task4 {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        if (o.toString().contains("Cat")) {
            System.out.println("Кошка");
        }
        else if (o.toString().contains("Dog")) {
            System.out.println("Собака");
        }
        else if (o.toString().contains("Bird")){
            System.out.println("Птица");
        }
        else if (o.toString().contains("Lamp")){
            System.out.println("Лампа");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
