package level02.lesson02;
/*
Откуда берутся Person?
*/

/*В классе Person объяви следующие переменные: name типа String, age типа int, weight типа int, money типа int.
В методе main создай объект Person, занеси его ссылку в переменную person.

Подсказка: для создания объекта Person и занесения его ссылки в переменную person используй конструкцию:
ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();*/
public class Task4 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
    }

    public static class Person {
        //напишите тут ваш код
        String name;
        int age;
        int weight;
        int money;
    }
}
