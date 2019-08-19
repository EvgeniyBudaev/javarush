package level05.lesson05;
/*
Геттеры и сеттеры для класса Person
*/
/*Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
Создайте геттеры и сеттеры для всех переменных класса Person.*/
public class Task8 {
    //напишите тут ваш код
    public String name;
    public int age;
    public char sex;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getSex(){
        return sex;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


    public void setSex(char sex){
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
