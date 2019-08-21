package level10.lesson11;
import java.util.ArrayList;
/*
Массив списков строк
*/
/*Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.*/
public class Task8 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] array = new ArrayList[3];
        for (int i = 0; i < 3; i++) {
            array[i] = new ArrayList<>();
            for (int j = 0; j < (int)(Math.random()*10); j++) {
                array[i].add(String.valueOf((int)(Math.random()*10)));
            }
        }
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
