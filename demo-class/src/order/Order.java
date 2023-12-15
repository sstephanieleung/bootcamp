package order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Order {

    private int id;

    private LocalDate buyDate;

    // private double totalAmount; //It can be calculated from sum of item prices

    private int status; // 0-Pending, 1-Completed

    private Item[] items;

    private static int orderNo = 0;

    public Order() {

    }

    public Order(LocalDate buyDate) {
        this.id = ++orderNo;
        this.buyDate = buyDate;
        this.items = new Item[0];
    }

    // public Order(int id, LocalDate buyDate) {
    //     this.id = id;
    //     this.buyDate = buyDate;
    //     this.items = new Item[0];
    // }

    // public Order(int id, LocalDate buyDate, double totalAmount) {
    //     // this.id = id;
    //     // this.buyDate = buyDate;
    //     // this.totalAmount = totalAmount;
    //     this(id, buyDate);
    //     // this.totalAmount=totalAmount; //Deleted: It can be calculated from sum of
    //     // item prices
    //     this.items = new Item[0];
    // }

    public void setid(int id) {
        this.id = id;
        this.items = new Item[0];
    }

    public void setDate(LocalDate buyDate) {
        this.buyDate = buyDate;
        this.items = new Item[0];
    }

    // public void setTotalAmount(Double Amount) {
    // this.totalAmount = Amount;
    // }

    public static double totalAmount(Item[] items) { // instance method
        BigDecimal total = BigDecimal.valueOf(0);
        for (Item element : items) {
            total = total
                    .add(BigDecimal.valueOf(element.getPrice()).multiply(BigDecimal.valueOf(element.getQuantity()))); // add
                                                                                                                      // return
                                                                                                                      // new
                                                                                                                      // object,so
                                                                                                                      // need
                                                                                                                      // a
                                                                                                                      // variable
                                                                                                                      // to
                                                                                                                      // store;
        }
        return total.doubleValue();
    }

    public double getTotalAmount() { // instance method
        BigDecimal total = BigDecimal.valueOf(0);
        for (Item element : this.items) {
            total = total
                    .add(BigDecimal.valueOf(element.totalAmount())); // add return new object,so need a variable to
                                                                     // store;
        }
        return total.doubleValue();
    }

    public void setStatus(boolean proceed) {
        this.status = proceed ? 1 : 0; // 0-Pending, 1-Completed
    }

    public int getID() {
        return this.id;
    }

    public int getStatus() {
        return this.status;
    }

    public void addItem(Item item) {
        Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);
        newItems[newItems.length - 1] = item;
        this.items = newItems;
    }

    public Item[] getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        return "" + this.id + " " + this.buyDate + " " + this.getTotalAmount();
    }

    public static void main(String[] args) {
        // Item[] items = new Item[] { new Item(12.3, 100), new Item(2.0, 50) };
        //Order order = new Order(1, LocalDate.of(2023, 12, 07));
        Order order = new Order(LocalDate.of(2023, 12, 07));
        order.addItem(new Item(5.0, 20, "250ml Milk"));
        order.addItem(new Item(6.0, 15, "330ml Soda"));
        Order order2 = new Order(LocalDate.of(2023, 12, 07));
        System.out.println(order.toString());
        System.out.println(order2.toString());
        double total = Order.totalAmount(order.items);
        System.out.println(total);
        System.out.println(order.getTotalAmount());

    }
}
