package level06.lesson08;
/*
Классовый счетчик
*/
/*Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.*/
public class Task1 {
    //напишите тут ваш код
    static int catCount;

    public Task1(){
        Task1.catCount++;
    }

    public static void main(String[] args) {

    }
}
