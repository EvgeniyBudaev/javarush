package level10.lesson11;
/*
Конструкторы класса Human
*/
/*Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.*/
public class Task6 {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private Integer age;
        private String name;
        private String surname;
        private Integer height;
        private Integer weight;
        private char sex;


        public Human(Integer age, String name, String surname, Integer height, Integer weight, char sex) {
            this.age = age;
            this.name = name;
            this.surname = surname;
            this.height = height;
            this.weight = weight;
            this.sex = sex;
        }
        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(Integer age) {
            this.age = age;
        }

        public Human(Integer height, Integer weight) {
            this.height = height;
            this.weight = weight;
        }

        public Human(char sex) {
            this.sex = sex;
        }

        public Human(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public Human(String surname) {
            this.surname = surname;
        }

        public Human(Integer age, Integer height, Integer weight) {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String surname, char sex) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }

        public Human() {}


    }
}
