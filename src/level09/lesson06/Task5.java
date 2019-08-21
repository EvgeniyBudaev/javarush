package level09.lesson06;
import java.util.HashMap;
/*
Исключение при работе с коллекциями Map
*/
/*Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap map = new HashMap(null);
map.put(null, null);
map.remove(null);*/
public class Task5 {
    public static void main(String[] args) throws Exception
    {
        try
        {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

    }
}
