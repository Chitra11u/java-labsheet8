class Result<T> {
    private T marks;

    public void setMarks(T marks) {
        this.marks = marks;
    }

    public T getMarks() {
        return marks;
    }
}

public class Labsheet8Q2 {
    public static void main(String[] args) {
        Result<Integer> r1 = new Result<>();
        r1.setMarks(88);
        System.out.println("Result 1 Marks: " + r1.getMarks());

        Result<Double> r2 = new Result<>();
        r2.setMarks(95.5);
        System.out.println("Result 2 Marks: " + r2.getMarks());
    }
}
