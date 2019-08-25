package level12.lesson12;
/*
Родитель класса CTO
*/
/*Добавь такой класс-родитель к классу CTO(технический директор), чтобы класс перестал быть абстрактным.
Добавлять/реализовывать методы в классе CTO запрещается.*/
public class Task9 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Second {
        public void workHard() {}
    }

    public static class CTO extends Second implements Businessman {

    }
}
