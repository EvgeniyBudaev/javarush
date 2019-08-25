package level12.lesson02;
/*
Определимся с животным
*/
/*Написать метод, который определяет, объект какого класса ему передали, и возвращает результат - одно значение из:
"Корова", "Кит", "Собака", "Неизвестное животное".*/
public class Task5 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        if (o.getClass()==Cow.class)
        {
            return "Корова";//Напишите тут ваше решение
        }
        else if (o.getClass()==Dog.class)
        {
            return "Собака";
        }
        else if (o.getClass()==Whale.class)
        {
            return "Кит";
        }
        else
            return "Неизвестное животное";

    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
