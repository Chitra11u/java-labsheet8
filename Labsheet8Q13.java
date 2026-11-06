class Student<T, U, V> {
    private T id;
    private U name;
    private V marks;

    public Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class Labsheet8Q13 {
    public static void main(String[] args) {
        Student<Integer, String, Double> s1 = new Student<>(1, "Alice", 85.5);
        Student<String, String, Integer> s2 = new Student<>("S002", "Bob", 92);
        Student<Integer, String, Character> s3 = new Student<>(3, "Charlie", 'A');

        s1.display();
        s2.display();
        s3.display();
    }
}
