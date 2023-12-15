package order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Item {

    private double price;

    private int quantity;

    private String desc;

    // All-args constructor
    public Item(){
        this(0.0,0,"");
    }
    public Item(double price, int quantity, String desc){
        this.price = price;
        this.quantity = quantity;
        this.desc = desc;
    }
    public Item(double price, String desc){
        this(price,0,desc);
    }
    public Item(int quantity, String desc){
        this(0.0,quantity,desc);
    }
    public Item(double price, int quantity){
        this(price,quantity,"");
    }
    public Item(String desc){
        this(0.0,0,desc);
    }
    public Item(double price){
        this(price,0,"");
    }
    public Item(int quantity){
        this(0.0,quantity,"");
    }

    // Setter
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int quantity){
        this.quantity = quantity;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }

    // Getter
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public String getDesc(){
        return this.desc;
    }

    public double totalAmount(){
        BigDecimal price = new BigDecimal(this.price);
        BigDecimal quantity = new BigDecimal(this.quantity);
        return price.multiply(quantity).doubleValue();
    }
    

public static void main(String[] args) {
        // Item[] items = new Item[] { new Item(12.3, 100), new Item(2.0, 50) };
        Order order = new Order(1, LocalDate.of(2023, 12, 07));
        order.addItem(new Item(5.0, 20, "250ml Milk"));
        order.addItem(new Item(6.0, 15, "330ml Soda"));
        System.out.println(Arrays.toString(order.getItems()));
        double total = Order.totalAmount(order.getItems());
        System.out.println(total);
        System.out.println(order.getTotalAmount());
        StringBuilder sb = new StringBuilder();
        sb.append(null)

    }

}
