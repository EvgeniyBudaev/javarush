package level05.lesson05;
/*
Реализовать метод fight
*/
/*Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет. Если ничья и никто не выиграл, возвращаем false

Должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false*/
public class Task2 {
    public int age;
    public int weight;
    public int strength;

    public Task2() {
    }

    public boolean fight(Task2 anotherCat) {
        //напишите тут ваш код
        if ((this.age + this.weight + this.strength) > (anotherCat.age + anotherCat.weight + anotherCat.strength)) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Task2 cat1 = new Task2();
        cat1.age = 5;
        cat1.weight = 8;
        cat1.strength = 14;
        Task2 cat2 = new Task2();
        cat2.age = 7;
        cat2.weight = 6;
        cat2.strength = 19;

        cat1.fight(cat2);

    }
}
