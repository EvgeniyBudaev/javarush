package level09.lesson08;
/*
Перехват unchecked-исключений
*/
/*В методе handleExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..catch*/
public class Task5 {
    public static void main(String[] args) {
        handleExceptions(new Task5());
    }

    public static void handleExceptions(Task5 obj) {
        try{
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (NullPointerException e)
        {
            printStack(e);
        }
        catch (IndexOutOfBoundsException e)
        {
            printStack(e);
        }
        catch (NumberFormatException e)
        {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
