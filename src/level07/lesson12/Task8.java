package level07.lesson12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Не компилируется задача про котиков
*/
/*Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.

Пример:
Cat's name: Barsik, age: 6, weight: 5, tail: 22
Cat's name: Murka, age: 8, weight: 7, tail: 20*/
public class Task8 {
    public final static ArrayList<Cat> CATS = new ArrayList<Cat>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();

            if (name.isEmpty()) break;
            //if (name == null) break;

            int age = Integer.parseInt(reader.readLine());
            int weight = Integer.parseInt(reader.readLine());
            int tailLength = Integer.parseInt(reader.readLine());

            Cat cat = new Cat(name, age, weight, tailLength);

            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;



        public Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}
