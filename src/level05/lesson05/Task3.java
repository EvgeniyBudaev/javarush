package level05.lesson05;
/*
Геттеры и сеттеры для класса Dog
*/
/*Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.*/
public class Task3 {
    //напишите тут ваш код
    public String name;
    public int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
    }
}
