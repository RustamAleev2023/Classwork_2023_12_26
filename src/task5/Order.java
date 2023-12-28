package task5;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<ProductTask5> products;
    private double totalCost;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<ProductTask5> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductTask5> products) {
        this.products = products;
    }

    public void addProduct(ProductTask5 product){
        products.add(product);
    }

    public double getTotalCost() {
        totalCost = 0;
        for (ProductTask5 product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }


    public void info() {
        System.out.println("Order =" + customer +
                ", products=" + products +
                ", totalCost=" + getTotalCost() +
                '}');

    }
}
