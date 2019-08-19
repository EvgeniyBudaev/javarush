package level05.lesson07;
/*
Создать класс Friend
*/
/*оздать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол

Примечание:
Имя(String), возраст(int), пол(char).*/
public class Task1 {
    //напишите тут ваш код
    private String name;
    private String sex;
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
