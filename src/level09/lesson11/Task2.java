package level09.lesson11;
/*
Обратный отсчёт
*/
/*Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
Обернуть вызов sleep в try..catch.*/
public class Task2 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            try{
                Thread.sleep(100);
            }catch(InterruptedException y){
                y.printStackTrace();
            }
        }
    }
}
