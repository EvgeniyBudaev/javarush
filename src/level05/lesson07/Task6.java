package level05.lesson07;
/*
Программист создает человека
*/
/*Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.*/
public class Task6 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person("Leha", 23);
    }

    static class Person {
        //напишите тут ваш код
        private String name;
        private int age;

        public Person (String name, int age){
            this.name = name;
            this.age=age;
        }
    }
}
