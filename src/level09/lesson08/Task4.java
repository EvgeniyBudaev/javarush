package level09.lesson08;
import java.io.IOException;
import java.rmi.RemoteException;
/*
Перехват checked-исключений
*/
/*В методе handleExceptions обработайте все checked исключения.
Нужно вывести на экран возникшее checked исключение.
Можно использовать только один блок try..catch*/
public class Task4 {
    public static void main(String[] args) {
        handleExceptions(new Task4());

    }

    public static void handleExceptions(Task4 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (RemoteException e) {
            System.out.println("RemoteException");
        }
        catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException");
        }
        catch (IOException e) {
            System.out.println("IOException");
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
