package level05.lesson09;
/*
Друзей не купишь
*/
/*Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол*/
public class Task1 {
    //напишите тут ваш код
    private String name, sex;
    private int age;

    public Task1(String name){
        this.name = name;
    }
    public Task1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Task1(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
