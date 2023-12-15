import java.time.LocalDateTime;

public interface Orders {
    
    boolean addItem();

    boolean deleteItem();

    LocalDateTime estLeadTime();

    double totalAmount();

}
