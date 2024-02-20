package lesson11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;


public class WriterRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/text2.txt");

        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file));

        printWriter.append("Hello");
    }
}
