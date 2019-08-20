package level07.lesson09;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Играем в Jолушку
*/
/*1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.*/
public class Task1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<Integer>(); //Главный список
        ArrayList<Integer> list2 = new ArrayList<Integer>(); //Список с числами которые делятся на 3 без остатка
        ArrayList<Integer> list3 = new ArrayList<Integer>(); //Список с числами которые делятся на 2 без остатка
        ArrayList<Integer> listNone = new ArrayList<Integer>(); //Список с числами которые делятся на 2 и на 3 без остатка

        for (int i = 0; i < 20; i++) { //цикл считывания и записи в главный список
            try {
                mainList.add(Integer.parseInt(reader.readLine()));//при считывании сразу перевод в целое число
            } catch (NumberFormatException e) { //если ввели не число
                System.out.println("не число"); //сообщаю об ошибке
                --i; //уменьшаю счетчик на 1
                continue; //досрочно заканчиваю итерацию
            }
        }

        for (int i = 0; i < mainList.size(); i++) { //работаю с основным списком
            if (mainList.get(i) % 3 == 0 && mainList.get(i) % 2 == 0) { //условие деления на 2 и на 3 без остатка
                list2.add(mainList.get(i)); //добавляю число в новый список
                list3.add(mainList.get(i)); //добавляю число в новый список
            } else if (mainList.get(i) % 3 == 0 && mainList.get(i) % 2 != 0) { //условие деления на 3 без остатка
                list2.add(mainList.get(i));
            } else if (mainList.get(i) % 2 == 0 && mainList.get(i) % 3 != 0) { //условие деления на 2 без остатка
                list3.add(mainList.get(i));
            } else {
                listNone.add(mainList.get(i));
            }
        }

        printList(list3);
        printList(list2);
        printList(listNone);
//другой вариант
//        for (int i = 0; i < 20; i++) {
//            int num = Integer.parseInt(reader.readLine());
//            mainList.add(num);
//            if (num%3==0 || (num%3==0 && num%2==0)) subListA.add(num);
//            if (num%2==0 || (num%2==0 && num%3==0)) subListB.add(num);
//            if (!(num%3==0) && !(num%2==0)) subListC.add(num);
//        }
    }
    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
