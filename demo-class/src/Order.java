import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {

    private int id;

    private LocalDate buyDate;

    private double totalAmount;

    private int status; //0-Pending, 1-Completed

    public Order() {

    }

    public Order(int id,LocalDate buyDate) {
        this.id = id;
        this.buyDate = buyDate;
    }

    public Order(int id, LocalDate buyDate, double totalAmount) {
        // this.id = id;
        // this.buyDate = buyDate;
        // this.totalAmount = totalAmount;
        this(id, buyDate);
        this.totalAmount=totalAmount;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public void setTotalAmount(Double Amount) {
        this.totalAmount = Amount;
    }

    public void setStatus(boolean proceed){
        this.status = proceed ? 1:0;  //0-Pending, 1-Completed
    }

    public int getID() {
        return this.id;
    }

    public int getStatus(){
        return this.status;
    }

    @Override
    public String toString() {
        return "" + this.id + " " + this.buyDate + " " + this.totalAmount;

    }
}
