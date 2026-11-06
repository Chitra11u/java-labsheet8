class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class Labsheet8Q4 {
    public static void main(String[] args) {
        Pair<Integer, String> employee = new Pair<>(101, "Alice Smith");
        System.out.println("Employee ID: " + employee.getKey());
        System.out.println("Employee Name: " + employee.getValue());
    }
}
