public class Labsheet8Q8 {
    public static <T> void display(T a, T b, T c) {
        System.out.println(a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        System.out.print("Integers: ");
        display(10, 20, 30);

        System.out.print("Strings: ");
        display("Apple", "Banana", "Cherry");

        System.out.print("Doubles: ");
        display(1.1, 2.2, 3.3);
    }
}
