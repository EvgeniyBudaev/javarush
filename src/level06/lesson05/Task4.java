package level06.lesson05;
/*
Ставим котов на счётчик
*/
/*В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1.
В методе finalize уменьшать на 1.*/
public class Task4 {
    public static int catCount = 0;

    //напишите тут ваш код
    public Task4(){
        catCount = catCount + 1;
    }

    //напишите тут ваш код

    @Override
    protected void finalize() throws Throwable {
        catCount = catCount - 1;
    }


    public static void main(String[] args) {

    }
}
