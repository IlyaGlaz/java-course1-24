package lesson11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/text.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        bufferedReader.lines()
               .forEach(str -> System.out.println(str));
    }
}
