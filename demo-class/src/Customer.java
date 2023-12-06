import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    // 17 types (Strings, Wrapper Class, Primitives)

    private Order[] orders;

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

    public boolean updateOrderAmount(int orderID, double newAmount) {
        for (Order element : this.orders)
            if (element.getID() == orderID) {
                element.setTotalAmount(newAmount);
                // element.totalAmount = newAmount; //<- Only for public attributes
                return true;
            }
        return false;
    }

    public int getOrderID(Order order) {
        for (Order element : this.orders) {
            if (order.equals(element)) {
                return element.getID();
            }
        }
        return -1;
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
        System.out.println(c1.updateOrderAmount(1234, 30.0));
        System.out.println("Updated O1 = " + o1);
    }
}
