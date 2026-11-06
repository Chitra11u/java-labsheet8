import java.util.ArrayList;

public class Labsheet8Q14 {
    public static <T> void displayList(ArrayList<T> list) {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("Python");
        strList.add("C++");

        System.out.print("Integer List: ");
        displayList(intList);

        System.out.print("String List: ");
        displayList(strList);
    }
}
Q15. Mini Generic Student Management Program (Labsheet8Q15.java)
Java
import java.util.ArrayList;

class StudentRecord<T, U, V> {
    private T id;
    private U name;
    private V marks;

    public StudentRecord(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public T getId() {
        return id;
    }

    public U getName() {
        return name;
    }

    public V getMarks() {
        return marks;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Labsheet8Q15 {
    public static void main(String[] args) {
        ArrayList<StudentRecord<Integer, String, Double>> students = new ArrayList<>();
        students.add(new StudentRecord<>(101, "Alice", 88.5));
        students.add(new StudentRecord<>(102, "Bob", 92.0));
        students.add(new StudentRecord<>(103, "Charlie", 79.5));
        students.add(new StudentRecord<>(104, "Diana", 95.0));
        students.add(new StudentRecord<>(105, "Ethan", 84.0));

        System.out.println("All Students:");
        for (StudentRecord<Integer, String, Double> s : students) {
            s.display();
        }

        System.out.println("Total Students: " + students.size());

        String searchName = "Charlie";
        boolean found = false;
        for (StudentRecord<Integer, String, Double> s : students) {
            if (s.getName().equals(searchName)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Student " + searchName + " found in the list.");
        } else {
            System.out.println("Student " + searchName + " not found.");
        }

        System.out.println("Type safety ensured by generics compile-time checking.");
    }
}
