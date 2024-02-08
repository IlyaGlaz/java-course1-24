package lesson9;

public class TodoRunner {
    public static void main(String[] args) {
        Todo todo = new Todo();

        todo.add(10, "Выпить кофе");
        todo.add(120, "Поиграть на гитаре");
        todo.add("Go work");

        System.out.println(todo);
    }
}
