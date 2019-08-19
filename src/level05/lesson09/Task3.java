package level05.lesson09;
/*
Регистрируем собачек
*/
/*Создать класс Dog (собака) с тремя конструкторами:
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
