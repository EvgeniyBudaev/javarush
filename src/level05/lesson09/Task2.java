package level05.lesson09;
/*
Конструируем котиков
*/
/*Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)*/
public class Task2 {
    //напишите тут ваш код
    private String name, color, address;
    private int weight = 8, age = 4;

    public Task2(String name){
        this.name = name;
    }
    public Task2(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Task2(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Task2(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public Task2(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
