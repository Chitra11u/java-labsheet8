import java.util.ArrayList;
import java.util.Scanner;

public class Labsheet8Q11 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 5; i <= 50; i += 5) {
            numbers.add(i);
        }
        System.out.println("List: " + numbers);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();
        if (numbers.contains(target)) {
            System.out.println("Number " + target + " exists in the list.");
        } else {
            System.out.println("Number " + target + " does not exist in the list.");
        }
        scanner.close();
    }
}
