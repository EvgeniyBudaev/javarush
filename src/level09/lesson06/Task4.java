package level09.lesson06;
import java.util.ArrayList;
/*
Исключение при работе с коллекциями List
*/
/*Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);*/
public class Task4 {
    public static void main(String[] args) throws Exception {

        try {

            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);

        }catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        }
    }
}
