class Employee<T, U> {
    private T id;
    private U name;

    public Employee(T id, U name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

public class Labsheet8Q6 {
    public static void main(String[] args) {
        Employee<Integer, String> emp = new Employee<>(501, "John Doe");
        emp.display();
    }
}
