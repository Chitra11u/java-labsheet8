class Student<T> {
    private T id;

    public void setId(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}

public class Labsheet8Q3 {
    public static void main(String[] args) {
        Student<String> student = new Student<>();
        student.setId("STU1005");
        System.out.println("Student ID: " + student.getId());
    }
}
