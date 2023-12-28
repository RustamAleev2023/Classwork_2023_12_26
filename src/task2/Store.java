package task2;

import java.util.ArrayList;

public class Store {
    private ArrayList<Product> list;

    public Store() {
        this.list = new ArrayList<>();
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public void update(Product product, int quantity) {
        if (list.contains(product)) {
            list.get(list.indexOf(product)).setQuantity(quantity);
        } else {
            System.out.println("Такого продукта нет");
        }
    }

    public void sellProduct(Product product, int amount) {
        if (list.contains(product)) {
            if (list.get(list.indexOf(product)).getQuantity() >= amount) {
                update(product, amount);
            } else {
                System.out.println("В наличие только " + list.get(list.indexOf(product)).getQuantity());
            }
        } else {
            System.out.println("Этого продукта нет");
        }
    }

    public void info() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void price() {
        int totalPrice = 0;
        for (Product product : list) {
            totalPrice += product.getPrice() * product.getQuantity();
        }
        System.out.println("Total store price = " + totalPrice);
    }


}
