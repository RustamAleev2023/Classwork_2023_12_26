package task5;

import java.util.ArrayList;

public class Customer {
    private String name;
//    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
//        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ArrayList<Order> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(ArrayList<Order> orders) {
//        this.orders = orders;
//    }

//    public void printOrders(){
//        for (Order order : orders) {
//            System.out.print(order + " ");
//        }
//    }

    @Override
    public String toString() {
        return "{Customer = " + name + "}";
    }
}
