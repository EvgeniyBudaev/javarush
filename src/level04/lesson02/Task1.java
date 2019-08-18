package level04.lesson02;
/*
Как зовут кота?
*/

/*Помогите коту обрести имя с помощью метода setName.*/
public class Task1 {
    private String name = "безымянный кот";

    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;
    }

    public static void main(String[] args) {
        Task1 cat = new Task1();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
