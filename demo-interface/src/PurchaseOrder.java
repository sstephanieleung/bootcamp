import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PurchaseOrder implements Orders {
    private static int orderCount = 1;

    private int orderNo;

    private String supplierName;

    private String contactNo;

    private Item[] items;

    private int[] qty;

    public PurchaseOrder(String supplierName){
        this.orderNo = orderCount++;
        this.supplierName = supplierName;
        this.contactNo = "";
        this.items = new Item[0];
        this.qty = new int[0];
    }

    public boolean addItem(){
        return true;
    }

    public boolean deleteItem(){
        return true;
    }

    public LocalDateTime estLeadTime(){
        return LocalDateTime.now().plusMonths(3);
    }

    public double totalAmount(){
        BigDecimal total = BigDecimal.valueOf(0);
        for(int i = 0; i < items.length; i++){
            total.add(BigDecimal.valueOf(items[i].getPrice()).multiply(BigDecimal.valueOf(qty[i])));
        }
        return totalAmount();
    }

}
