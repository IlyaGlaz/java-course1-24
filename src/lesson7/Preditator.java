package lesson7;

public interface Preditator {
    final static String NAME_ANIMAL = "Preditator";

    void hunt();

    void runFast();

    default void someMethod() {
        someStaticMethod();
    }

    static void someStaticMethod() {

    }

}
