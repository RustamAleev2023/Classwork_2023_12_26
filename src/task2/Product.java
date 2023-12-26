package task2;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
    private static AtomicInteger idCounter=new AtomicInteger(0);

    private int id;
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.id = idCounter.addAndGet(1);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static AtomicInteger getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(AtomicInteger idCounter) {
        Product.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
