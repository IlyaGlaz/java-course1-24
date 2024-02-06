package lesson7;

public class EnumRunner {
    public static void main(String[] args) {
        Color red = Color.RED;

        Color[] values = Color.values();

        for (Color color : values) {
            System.out.println(color);
        }

//        System.out.println(red);

        Tiger tiger = new Tiger(Color.ORANGE);

        System.out.println(tiger);
    }
}
