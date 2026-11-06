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
