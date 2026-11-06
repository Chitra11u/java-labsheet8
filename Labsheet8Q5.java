class Product<K, V> {
    private K id;
    private V price;

    public Product(K id, V price) {
        this.id = id;
        this.price = price;
    }

    public void display() {
        System.out.println("Product ID: " + id + ", Price: " + price);
    }
}

public class Labsheet8Q5 {
    public static void main(String[] args) {
        Product<Integer, Double> p1 = new Product<>(101, 799.99);
        Product<String, Double> p2 = new Product<>("P002", 1250.00);
        Product<Integer, Integer> p3 = new Product<>(103, 450);

        p1.display();
        p2.display();
        p3.display();
    }
}
