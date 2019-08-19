package level05.lesson09;
/*
Создать класс прямоугольник (Rectangle)
*/

import java.awt.*;

/*Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.*/
public class Task5 {
    //напишите тут ваш код
    private int left  = 0;
    private int top=0;
    private int width = 0;
    private int height=0;

    public Task5(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Task5(int left, int top){
        this.left = left;
        this.top = top;
    }
    public Task5(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }
    public Task5(Task5 another){
        this.left = another.left;
        this.top = another.top;
        this.width = another.width;
        this.height = another.height;
    }

    public static void main(String[] args) {

    }
}
