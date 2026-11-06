class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Labsheet8Q1 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Integer Value: " + intBox.getValue());

        Box<String> strBox = new Box<>();
        strBox.setValue("Hello Java");
        System.out.println("String Value: " + strBox.getValue());

        Box<Double> dblBox = new Box<>();
        dblBox.setValue(45.67);
        System.out.println("Double Value: " + dblBox.getValue());
    }
}
