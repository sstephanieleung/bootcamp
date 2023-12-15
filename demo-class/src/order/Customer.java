package order;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    // 17 types (Strings, Wrapper Class, Primitives)

    private Order[] orders;
    private Item[] itemList;
    private int age;

    // Empty Constructor
    public Customer() {
        this.orders = new Order[0];
    }

    public Customer(Order order) {
        this.orders = new Order[] { order };
    }

    public Customer(Order[] orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        Order[] newOrders = Arrays.copyOf(this.orders, this.orders.length + 1);
        newOrders[newOrders.length - 1] = order;
        this.orders = newOrders;
    }

    public void deleteOrder(int orderId) {
        int idx = 0;
        boolean found = false;
        Order[] newArr = new Order[this.orders.length - 1];
        Order[] ordArr = Arrays.copyOfRange(this.orders, idx + 1, this.orders.length);

        // for (Order element : this.orders) {
        // if (element.getID() != orderId) {
        // newArr[idx++] = element;
        // } else{
        // found = true;
        // }
        // }

        for (Order element : this.orders) {
            if (element.getID() == orderId) {

            }
        }
    }

    // public boolean updateOrderAmount(int orderID, double newAmount) {
    //     for (Order element : this.orders)
    //         if (element.getID() == orderID) {
    //             element.setTotalAmount(newAmount);
    //             // element.totalAmount = newAmount; //<- Only for public attributes
    //             return true;
    //         }
    //     return false;
    // }

    public int getOrderID(Order order) {
        for (Order element : this.orders) {
            if (order.equals(element)) {
                return element.getID();
            }
        }
        return -1;
    }

    public Order[] getOrders() {
        return this.orders;
    }

    public Order getOrder(int orderId) {
        for (Order element : this.orders) {
            if (element.getID() == orderId) {
                return element;
            }
        }
        return null;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 18 ? true : false;
    }

    public boolean isVip() {
        return this.getOrders().length >= 100 ? true : false;
    }

    public String membership(){
        if(this.orders.length >=100){
            return "Gold";
        } else if(this.orders.length>=50){
            return "Silver";
        }
        return "General";
    }

    public static void main(String[] args) {
        // New a Customer object
        // New some order objects, and put into the customer object
        // research -> Class of class
        Customer c1 = new Customer();
        Customer c2 = new Customer(new Order[] { new Order(), new Order() });
        Order o1 = new Order(123, LocalDate.of(2023, 12, 2), 20.3d);
        Order o2 = new Order();
        c1.addOrder(o1);
        c1.addOrder(o2);
        o1.setid(1234);
        System.out.println(c1.getOrderID(o1));

        System.out.println("Original O1 = " + o1);
        //System.out.println(c1.updateOrderAmount(1234, 30.0));
        System.out.println("Updated O1 = " + o1);
        double totalAmount = o1.getTotalAmount();

        c1.setAge(18);
        if (c1.isAdult()) {
            System.out.println("The customer is adult");
        }
        if (c1.isVip()) {
            System.out.println("The customer is VIP");

        }

    }
}
