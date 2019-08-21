package level09.lesson11;
import java.io.*;
/*
Код не компилится…
*/
/*Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.*/
public class Task10 {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String sourceFileName = reader.readLine();
    String destinationFileName = reader.readLine();

    InputStream fileInputStream = getInputStream(sourceFileName);
    OutputStream fileOutputStream = getOutputStream(destinationFileName);

    int count = 0;
//        System.out.println("Размер файла: " + fileInputStream.available() + " байт(а)");

    int i=-1;
        while((i=fileInputStream.read())!=-1){

        fileOutputStream.write(i);
        count++;
    }


        System.out.println("Скопировано байт " + count);

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
