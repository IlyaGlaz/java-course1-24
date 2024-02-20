package lesson11;

import java.io.FileNotFoundException;

public class ExceptionRunner {
    public static void main(String[] args) {
        System.out.println("Befor Exception");

//        try {
//
//            throw new UserNotFoundException("Такой пользователь не найден");
//
//        } catch (UserNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        System.out.println("After Exception");


        try {

            dangerMethod();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    static void dangerMethod() throws InterruptedException, FileNotFoundException {

//        try {

            Thread.sleep(1000);

            throw new FileNotFoundException();

//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


    }
}
