package level07.lesson06;
import java.util.ArrayList;
/*
Что за список такой?
*/
/*1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.*/
public class Task1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>(); //создали список строк
        for(int i = 0; i < 5; i++){
            list.add("s" + i);
        }
        System.out.println(list.size());

        for(int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }
    }
}
