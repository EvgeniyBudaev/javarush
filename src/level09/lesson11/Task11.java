package level09.lesson11;
import java.io.*;
/*
Обогатим код функциональностью!
*/
/*Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то программа должна вывести надпись "Файл не
существует." и еще один раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
 */
public class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fileInputStream=null;
        String sourceFileName=null;
        try {
            sourceFileName = reader.readLine();

            fileInputStream = getInputStream(sourceFileName);
        }

        catch (IOException e){System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }

        OutputStream fileOutputStream=null;
        String destinationFileName = reader.readLine();
        fileOutputStream = getOutputStream(destinationFileName);
        while (fileInputStream.available() > 0) {
            fileOutputStream.write(fileInputStream.read());
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
