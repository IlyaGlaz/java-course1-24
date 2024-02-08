package lesson9;

import java.util.ArrayList;

public class Todo {
    private ArrayList<String> todos = new ArrayList<>();

    public void add(String delo) {
        todos.add(delo);
        System.out.println("Дело " + delo + " добавлено в конeц");
    }

    public void add(int index, String delo) {
        if (index <= todos.size()) {
            todos.add(index, delo);
            System.out.println("Дело " + delo + " добавлено на позицию " + index);
        } else {
            add(delo);
        }
    }


}
