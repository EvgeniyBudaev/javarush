package level05.lesson07;
/*
Создать класс Dog
*/
/*Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет*/
public class Task3 {
    //напишите тут ваш код
    private String name, color;
    private int age;
    public Task3(String name){
        this.name = name;
    }
    public Task3(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Task3(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
