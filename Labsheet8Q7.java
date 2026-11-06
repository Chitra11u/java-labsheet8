public class Labsheet8Q7 {
    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        display(100);
        display(99.99);
        display("Generics in Java");
        display('Z');
    }
}
