import java.util.ArrayList;

public class Labsheet8Q10 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");

        System.out.println("Initial List: " + students);
        System.out.println("Element at index 1: " + students.get(1));

        students.set(1, "Bobby");
        System.out.println("After set index 1: " + students);

        students.remove("Charlie");
        System.out.println("After remove Charlie: " + students);

        System.out.println("Size of list: " + students.size());
    }
}
