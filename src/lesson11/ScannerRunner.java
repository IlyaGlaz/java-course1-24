package lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            strings.add(str);

            if (str.equals("finish")) {
                break;
            }
        }

        System.out.println(strings);
    }
}
